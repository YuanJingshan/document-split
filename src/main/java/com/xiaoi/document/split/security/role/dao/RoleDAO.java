package com.xiaoi.document.split.security.role.dao;

import com.xiaoi.document.split.security.role.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RoleDAO extends JpaRepository<Role, String>, JpaSpecificationExecutor<Role> {

}