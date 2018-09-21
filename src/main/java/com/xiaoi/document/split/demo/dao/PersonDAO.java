package com.xiaoi.document.split.demo.dao;

import com.xiaoi.document.split.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 * @auth Yuan Jingshan
 * @date 2018/5/16
 */
public interface PersonDAO extends JpaRepository<Person, String>, JpaSpecificationExecutor<Person> {

}