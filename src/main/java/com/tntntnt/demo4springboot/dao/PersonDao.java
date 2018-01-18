package com.tntntnt.demo4springboot.dao;

import com.tntntnt.demo4springboot.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface PersonDao extends JpaRepository<Person, Long> {

    List<Person> findAll();

    Person findById(int id);

    void deleteById(int id);

}