package com.tntntnt.demo4springboot.handler;

import com.tntntnt.demo4springboot.model.Person;

import java.util.List;

public interface AHandler {

    List<Person> findAll();

    Person findById(int id);

    void deleteById(int id);

    void add(Person person);

    void update(Person person);
}
