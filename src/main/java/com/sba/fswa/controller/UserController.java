package com.sba.fswa.controller;

import com.sba.fswa.entities.User;
import com.sba.fswa.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3333") // React Port - local testing
@RequestMapping(path="/users")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    /**
     * Request all users from db
     * @return List of all User objects from db
     */
    @GetMapping(path="/all")
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    /**
     * Request a specific user by firstname from params
     * @return User object of the specified user
     */
    @GetMapping(path="/{firstName}")
    public User getUser(@RequestParam("firstName") String firstName) {
        return userRepo.findByFirstname(firstName);
    }

//
//    /**
//     * Request all data and return response (return str if no db)
//     * @return string as a successful get request
//     */
//    @GetMapping(path="/{firstname}")
//    public String getUser() {
//
//        return "GET REQUESTED";
//    }
//
//    /**
//     * Send data to server for creating a new record
//     * @param user The user object received by the client
//     * @return validated post request with inputted full name concatenated
//     */
//    @PostMapping(path="/new")
//    @ResponseStatus(HttpStatus.CREATED) // changing default 200 to 201 status
//    public String postData(@RequestBody User user) {
//        System.out.println("POST REQ");
//        return "POST REQUESTED: " + user.getFirstname() + " " + user.getLastname();
//    }
//
//    /**
//     * Send in user id in params to update user data from body
//     * @param user The fields needing to be updated on the user
//     * @return validated put request with inputted new name
//     */
//    @PutMapping(path="/{id}")
//    @ResponseStatus(HttpStatus.ACCEPTED)
//    public String putData(User user) {
//        String fname = user.getFirstname();
//
//        System.out.println("PUT REQ");
//        return "PUT REQUESTED: " + fname;
//    }
//
//    /**
//     * Removing records from the server with a specified id by params
//     * @return validated delete request as a string
//     */
//    @DeleteMapping(path="/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public String deleteData() {
//        System.out.println("DEL REQ");
//        return "DELETE REQUESTED";
//    }
}
