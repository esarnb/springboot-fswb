package com.sba.fswa.repository;

import com.sba.fswa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long > {
    // Extend Crud methods and jpa repo methods

    // custom find method by property firstname
    User findByFirstname(String firstname);
}