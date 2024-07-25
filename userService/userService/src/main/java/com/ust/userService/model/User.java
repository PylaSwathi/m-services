package com.ust.userService.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user")
@Entity
public class User {

    @Id
    private String id;
    private String userName;
    private String email;
    private String location;
    private String phoneNumber;


}
