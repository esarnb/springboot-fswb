package com.sba.fswa.entities;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
//@AllArgsConstructor
//@NoArgsConstructor
public class User {

    private Integer id; // PK
    private String firstname; // NN
    private String lastname; // NN
    private String avatar;
    private Integer age;

}
