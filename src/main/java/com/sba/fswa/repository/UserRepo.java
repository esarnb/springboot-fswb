package com.sba.fswa.repository;

import com.sba.fswa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long > {
    // Extend Crud methods and jpa repo methods

    // General methods to interact to db
     List<User> findAll();
     User findByFirstname(String firstname);

}