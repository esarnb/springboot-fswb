package com.sba.fswa.controller;

import com.sba.fswa.entities.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class UserTests {
    @Test
    void GetInfo() {
        // Make an instance of the crud controller class
        UserController user = new UserController();

        Iterable<User> getResponse = user.getAllUsers();

        // create local new user as actual
        User person = new User(1, "emp", "muffins", "test", 42);
        User person2 = new User(2, "emp2", "muffins", "test", 42);
        ArrayList<User> users = new ArrayList<>();
        users.add(person);
        users.add(person2);

        // compare the value against the expected vs actual
        Assertions.assertEquals(users, getResponse);
        // "Expected" comes first, then variable of "actual" value received
    }

}
