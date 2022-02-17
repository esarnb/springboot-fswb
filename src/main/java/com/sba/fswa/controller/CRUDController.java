package com.sba.fswa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController // REST label
@CrossOrigin(origins = "http://localhost:3333") // React Port - local testing
@RequestMapping(path="/crud") // main api endpoint
public class CRUDController {

    @GetMapping(path="/")
    public String getData() {

        return "GET REQUESTED";
    }

    @PostMapping(path="/")
    @ResponseStatus(HttpStatus.CREATED) // changing default 200 to 201 status
    public String postData() {

        return "POST REQUESTED";
    }

    @PutMapping(path="/")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String putData() {

        return "PUT REQUESTED";
    }

    @DeleteMapping(path="/")
    @ResponseStatus(HttpStatus.OK)
    public String deleteData() {

        return "DELETE REQUESTED";
    }
}
