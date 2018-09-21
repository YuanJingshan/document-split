package com.xiaoi.document.split.demo.service;

import com.xiaoi.document.split.demo.entity.Person;

import java.util.List;

/**
 *
 * @auth Yuan Jingshan
 * @date 2018/5/16
 */
public interface PersonService {
    // 查询所有
    List<Person> getAll();

    Person getByID(String ID);
}
