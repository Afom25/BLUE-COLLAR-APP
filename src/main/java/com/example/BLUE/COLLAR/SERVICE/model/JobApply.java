package com.example.BLUE.COLLAR.SERVICE.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JobApply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  Long id;

    private String username;
    private String gender;
    private String jobtitle;
    private String location;
    private String telephone;
    private String email;

    public JobApply(String username, String gender, String jobtitle, String location, String telephone, String email) {
        this.username = username;
        this.gender = gender;
        this.jobtitle = jobtitle;
        this.location = location;
        this.telephone = telephone;
        this.email = email;
    }

    public JobApply() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
