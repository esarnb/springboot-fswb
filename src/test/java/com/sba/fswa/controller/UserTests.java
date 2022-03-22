package com.sba.fswa.controller;

import com.sba.fswa.entities.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTests {
    @Test
    void GetInfo() {
        // Make an instance of the crud controller class
        UserController user = new UserController();

        // use the methods on the class to get a return value
        String getResponse = user.getAllUsers();

        // compare the value against the expected vs actual
        Assertions.assertEquals("GET REQUESTED", getResponse);
        // "Expected" comes first, then variable of "actual" value received
    }

}
