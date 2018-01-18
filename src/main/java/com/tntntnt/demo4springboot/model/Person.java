package com.tntntnt.demo4springboot.model;


import javax.persistence.*;

@Entity
@Table(name = "Person")
public class Person {

    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name", length = 30)
    private String name;

    @Column(name = "age", length = 11)
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
