package com.javatodo.list.service;

import com.javatodo.list.model.TodoLists;
import com.javatodo.list.repository.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListService {

    @Autowired
    private ListRepository listRepository;


    public List<TodoLists> getLists() {
        return listRepository.findAll();
    }
}
