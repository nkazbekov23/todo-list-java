package com.javatodo.list.model;

import javax.persistence.*;


@Entity
public class Lists {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer colorId;


    public Lists() {}

    public Lists(String name, Integer colorId) {
        this.name = name;
        this.colorId = colorId;
    }

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

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public Integer getColorId() {
        return colorId;
    }
}
