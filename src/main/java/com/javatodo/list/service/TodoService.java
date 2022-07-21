package com.javatodo.list.service;

import com.javatodo.list.model.*;
import com.javatodo.list.repository.ColorRepository;
import com.javatodo.list.repository.ListRepository;
import com.javatodo.list.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService implements CommandLineRunner {

    @Autowired
    private ListRepository listRepository;
    @Autowired
    private ColorRepository colorRepository;
    @Autowired
    private TaskRepository taskRepository;


    public List<ListDto> getLists() {

        List<ListDto> lists = listRepository.findAll().stream().map(l -> {
            Color color = colorRepository.findById(l.getColorId()).orElse(null);
            List<Task> tasks = taskRepository.findByListId(l.getId());
            ListDto listDto = new ListDto(l.getId(), l.getName(), l.getColorId(), tasks, color);
            return listDto;
        }).collect(Collectors.toList());

        return lists;
    }

    public List<Color> getColors() {
        return colorRepository.findAll();
    }

    @Transactional
    public Lists addTodo(TodoAddData data) {
        Lists lists = new Lists();
        lists.setName(data.getName());
        lists.setColorId(data.getColorId());
        Lists saveList = listRepository.save(lists);
        return saveList;
    }

    @Transactional
    public void removeList(Integer listId) {
        listRepository.deleteById(listId);
    }

    @Transactional
    public Task addTask(TaskAddData data) {
        Task task = new Task();
        task.setId(data.getListId());
        task.setText(data.getText());
        task.setCompleted(data.isCompleted());
        Task saveTask = taskRepository.save(task);
        return saveTask;
    }

    @Transactional
    @Override
    public void run(String... args) {
        try {
            Color color = colorRepository.save(new Color("123", "red"));

            Lists lists = new Lists("FrontEnd", color.getId());
            listRepository.save(lists);

            Task task = new Task("learn react", lists.getId());
            taskRepository.save(task);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
