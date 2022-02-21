package com.sba.fswa.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CRUDTests {
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
        String postResponse = crud.postData();
        Assertions.assertEquals("POST REQUESTED", postResponse);
    }


    @Test
    void PutInfo() {
        CRUDController crud = new CRUDController();
        String putResponse = crud.putData();
        Assertions.assertEquals("PUT REQUESTED", putResponse);
    }


    @Test
    void DeleteInfo() {
        CRUDController crud = new CRUDController();
        String deleteResponse = crud.deleteData();
        Assertions.assertEquals("DELETE REQUESTED", deleteResponse);
    }

}
