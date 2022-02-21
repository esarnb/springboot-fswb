package com.sba.fswa.controller;

import com.sba.fswa.entities.DataObj;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CRUDTests {
    @Test
    void checkUser() {

        DataObj user = new DataObj();
        user.setId(2);
        user.setFirstname("Alpha");
        user.setLastname("Beta");
        user.setAvatar_url("https://random.test/img.png");
        user.setAge(42);

        System.out.println(user);
        System.out.println(user.getId());
        System.out.println(user.getAge());
        System.out.println(user.getAvatar_url());

        Assertions.assertEquals("Alpha Beta", user.getFirstname() + " " + user.getLastname());
    }

    @Test
    void GetInfo() {
        // Make an instance of the crud controller class
        CRUDController crud = new CRUDController();

        // use the methods on the class to get a return value
        String getResponse = crud.getData();

        // compare the value against the expected vs actual
        Assertions.assertEquals("GET REQUESTED", getResponse);
        // "Expected" comes first, then variable of "actual" value received
    }

    @Test
    void PostInfo() {
        CRUDController crud = new CRUDController();
        DataObj user = new DataObj();
        user.setId(2);
        user.setFirstname("Alpha");
        user.setLastname("Beta");
        user.setAvatar_url("https://random.test/img.png");
        user.setAge(42);
        String postResponse = crud.postData(user);
        Assertions.assertEquals("POST REQUESTED: Alpha Beta", postResponse);
    }


    @Test
    void PutInfo() {
        CRUDController crud = new CRUDController();
        DataObj user = new DataObj();
        user.setId(2);
        user.setFirstname("Alpha2");
        user.setLastname("Beta");
        user.setAvatar_url("https://random.test/img.png");
        user.setAge(42);
        String putResponse = crud.putData(user);
        Assertions.assertEquals("PUT REQUESTED: Alpha2", putResponse);
    }


    @Test
    void DeleteInfo() {
        CRUDController crud = new CRUDController();
        String deleteResponse = crud.deleteData();
        Assertions.assertEquals("DELETE REQUESTED", deleteResponse);
    }

}
