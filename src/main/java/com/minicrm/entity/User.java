package com.minicrm.entity;

import javax.persistence.*;


@Entity
@Table(name="users")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        private String email;

        private String password;

        // getters and setters...
    }

