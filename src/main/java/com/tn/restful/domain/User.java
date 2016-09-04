package com.tn.restful.domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by thangnguyen-imac on 9/3/16.
 */
@XmlRootElement(name = "user")
public class User {

    private Integer id;

    private String name;

    private Integer age;

    private Float salary;

    public User(){}

    public User(Integer id, String name, Integer age, Float salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
