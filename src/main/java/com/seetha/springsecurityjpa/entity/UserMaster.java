package com.seetha.springsecurityjpa.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user_master")
@Data
public class UserMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String password;
    private String roles;
    private boolean active;
}
