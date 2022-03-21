package com.sba.fswa.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity
//@AllArgsConstructor
//@NoArgsConstructor
public class DataObj {

    private Integer id; // unique identifier in the db
    private String firstname;
    private String lastname;
    private String avatar_url;
    private Integer age;

}
