package com.sba.fswa.controller;

import com.sba.fswa.entities.User;
import com.sba.fswa.repository.UserRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class UserTests {

    @Autowired
    private UserRepo userRepo;

    @Test
    void GetInfo() {

        // Actual value from repo - to do: setup testing database
        List<User> getResponse = userRepo.findAll();

        // create local new user for expected response
        User person = new User(1, "emp", "muffins", "test", 42);
        User person2 = new User(2, "emp2", "muffins", "test", 42);

        List<User> users = new ArrayList<>();
        users.add(person);
        users.add(person2);

        // compare the value against the expected vs actual
        Assertions.assertEquals(users, getResponse);
        // "Expected" comes first, then variable of "actual" value received
    }

}
