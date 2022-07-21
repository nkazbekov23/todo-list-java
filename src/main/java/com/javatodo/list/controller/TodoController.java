package com.javatodo.list.controller;

import com.javatodo.list.model.*;
import com.javatodo.list.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<ListDto> getList() {
        return todoService.getLists();
    }

    @GetMapping("/colors")
    public List<Color> getColors() {
        return todoService.getColors();
    }

    @PostMapping("/add")
    public Lists addTodo(@RequestBody TodoAddData data) {
        return todoService.addTodo(data);
    }

    @DeleteMapping("/delete/{listId}")
    public ResponseEntity<?> removeList(@PathVariable Integer listId) {
        todoService.removeList(listId);
        return ResponseEntity.ok("success removed");
    }

    @PostMapping("/add/task")
    public Task addTask(@RequestBody TaskAddData data) {
        return todoService.addTask(data);
    }
}
