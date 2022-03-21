package com.sba.fswa.controller;

import com.sba.fswa.entities.DataObj;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController // REST label combines @Controller and @ResponseBody
@CrossOrigin(origins = "http://localhost:3333") // React Port - local testing
@RequestMapping(path="/crud") // main api endpoint
public class CRUDController {

    /**
     * Request all data and return response (return str if no db)
     * @return string as a successful get request
     */
    @GetMapping(path="/")
    public String getData() {
        System.out.println("GET REQ");
        return "GET REQUESTED";
    }

    /**
     * Send data to server for creating a new record
     * @param user The user object received by the client
     * @return validated post request with inputted full name concatenated
     */
    @PostMapping(path="/")
    @ResponseStatus(HttpStatus.CREATED) // changing default 200 to 201 status
    public String postData(@RequestBody DataObj user) {
        System.out.println("POST REQ");
        return "POST REQUESTED: " + user.getFirstname() + " " + user.getLastname();
    }

    /**
     * Send in bits of information to be updated on the server
     * @param user The fields needing to be updated on the user
     * @return validated put request with inputted new name
     */
//    @PutMapping(path="/{id}")
    @PutMapping(path="/")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String putData(DataObj user) {
        String fname = user.getFirstname();
        // make edit into db and return newName if no errors

        System.out.println("PUT REQ");
        return "PUT REQUESTED: " + fname;
    }

    /**
     * Removing records from the server with a specified id
     * @return validated delete request as a string
     */
    @DeleteMapping(path="/")
    @ResponseStatus(HttpStatus.OK)
    public String deleteData() {
        // TODO: Add specific id (or other uid) to find and delete record (specific user)
        System.out.println("DEL REQ");
        return "DELETE REQUESTED";
    }
}
