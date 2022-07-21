package com.javatodo.list.model;

import java.util.List;

public class ListDto {
    private Integer id;
    private String name;
    private Integer colorId;
    private List<Task> tasks;
    private Color color;

    public ListDto(Integer id, String name, Integer colorId, List<Task> tasks, Color color) {
        this.id = id;
        this.name = name;
        this.colorId = colorId;
        this.tasks = tasks;
        this.color = color;
    }
    public ListDto() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
