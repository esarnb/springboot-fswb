package com.sba.fswa.entities;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
//@AllArgsConstructor
//@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // PK

    private String firstname; // NN
    private String lastname; // NN
    private String avatar;
    private Integer age;

}
