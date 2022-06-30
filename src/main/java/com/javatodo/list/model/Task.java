package com.javatodo.list.model;

import lombok.Data;

@Data
public class Task {

    private Integer id;
    private String text;
    private boolean completed;
    private Integer listId;

}
