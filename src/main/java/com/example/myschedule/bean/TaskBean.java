package com.example.myschedule.bean;

import lombok.Data;

/**
 * @author wxy
 * @create 2019-03-02 11:34
 **/
@Data
public class TaskBean {

    private String id;
    private String name;

    public TaskBean(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
