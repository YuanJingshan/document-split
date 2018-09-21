package com.xiaoi.document.split.demo.service.impl;

import com.xiaoi.document.split.demo.dao.PersonDAO;
import com.xiaoi.document.split.demo.entity.Person;
import com.xiaoi.document.split.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @Author Yuan Jingshan
 * @Date 2018-05-16
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDAO personDAO;

    @Override
    public List<Person> getAll() {
        return personDAO.findAll();
    }

    @Override
    public Person getByID(String ID) {
        Optional<Person> person = personDAO.findById(ID);
        return person.orElse(null);
    }

}
