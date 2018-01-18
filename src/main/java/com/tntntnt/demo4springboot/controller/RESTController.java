package com.tntntnt.demo4springboot.controller;

import com.tntntnt.demo4springboot.model.Person;
import com.tntntnt.demo4springboot.handler.AHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/rest")
@RestController
public class RESTController {

    @Autowired
    AHandler aHandler;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Person> list() {
        return aHandler.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Person getById(@PathVariable int id) {
        return aHandler.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable int id) {
        aHandler.deleteById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add(@RequestBody Person person) {
        aHandler.add(person);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody Person person) {
        aHandler.update(person);
    }
}

