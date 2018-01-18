package com.tntntnt.demo4springboot.handler.impl;


import com.tntntnt.demo4springboot.model.Person;
import com.tntntnt.demo4springboot.dao.PersonDao;
import com.tntntnt.demo4springboot.handler.AHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AHandlerImpl implements AHandler {

    @Autowired
    PersonDao personDao;

    @Override
    public List<Person> findAll() {
        return personDao.findAll();
    }

    @Override
    public Person findById(int id) {
        return personDao.findById(id);
    }

    @Override
    public void deleteById(int id) {
        personDao.deleteById(id);
    }

    @Override
    public void add(Person person) {
        personDao.save(person);
    }

    @Override
    public void update(Person person) {
        personDao.save(person);
    }
}

