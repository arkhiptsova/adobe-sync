package com.adobe_sync.entity;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "admin_user")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id_admin_user;

    private String email;

    private String password;

    private String status;


    public Integer getIdAdminUser() {
        return id_admin_user;
    }

    public void setIdAdminUser(Integer id_admin_user) {

        this.id_admin_user = id_admin_user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() { return status; }

    public void setStatus(String status) {
        this.status = status;
    }

    public Admin() {}

    public Admin(Integer id_admin_user, String email, String password,
                 String status) {
        this.id_admin_user = id_admin_user;
        this.email = email;
        this.password = password;
        this.status = status;
    }


}
