package com.sba.fswa.controller;

import com.sba.fswa.entities.DataObj;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController // REST label combines @Controller and @ResponseBody
@CrossOrigin(origins = "http://localhost:3333") // React Port - local testing
@RequestMapping(path="/crud") // main api endpoint
public class CRUDController {

    @GetMapping(path="/")
    public String getData() {
        return "GET REQUESTED";
    }

    @PostMapping(path="/")
    @ResponseStatus(HttpStatus.CREATED) // changing default 200 to 201 status
    public String postData(@RequestBody DataObj user) {
        return "POST REQUESTED: " + user.getFirstname() + " " + user.getLastname();
    }

    @PutMapping(path="/")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String putData(DataObj user) {
        String fname = user.getFirstname();
        // make edit into db and return newName if no errors
        return "PUT REQUESTED: " + fname;
    }

    @DeleteMapping(path="/")
    @ResponseStatus(HttpStatus.OK)
    public String deleteData() {

        return "DELETE REQUESTED";
    }
}
