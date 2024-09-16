package com.app.server.model.entity;

import java.util.List;

public class Company {

    private Integer id;
    private String name;
    private Employee owner;
    private Float rating;
    private List<Employee> workers;
    private String description;

}
