package com.adobe_sync.entity;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id_user;

    private String email;

    private String first_name;

    private String last_name;

    private Integer id_district;

    public Integer getId() {
        return id_user;
    }

    public void setId(Integer id) {
        this.id_user = id_user;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdDistrict() {
        return id_district;
    }

    public void setIdDistrict(Integer id_district) {
        this.id_district = id_district;
    }

    public User() {}

    public User(Integer id_user, String first_name, String last_name, String email, Integer id_distrcit) {
        this.id_user = id_user;
        this.first_name = first_name;
        this.last_name = last_name;
        this.id_district = id_district;
    }
}

