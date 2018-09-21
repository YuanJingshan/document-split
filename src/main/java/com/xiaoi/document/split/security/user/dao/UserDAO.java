package com.xiaoi.document.split.security.user.dao;

import com.xiaoi.document.split.security.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface UserDAO extends JpaRepository<User, String>, JpaSpecificationExecutor<User> {
    User findByUsername(String username);
}