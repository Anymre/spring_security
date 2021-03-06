package com.connext.spring_security.dao;

import com.connext.spring_security.entity.Authority;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @Author: Marcus
 * @Date: 2018/12/20 10:25
 * @Version 1.0
 */
public interface AuthorityRepository extends CrudRepository<Authority, Integer> {
    /**
     * find a user by name
     * @param name user's name
     * @return the user
     */
    Optional<Authority> findByName(String name);
}

