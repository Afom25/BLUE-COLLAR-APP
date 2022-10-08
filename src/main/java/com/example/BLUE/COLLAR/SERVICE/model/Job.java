package com.example.BLUE.COLLAR.SERVICE.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Job {

    private Long id;
    private String user;
    private String jobTitle;
    private String location;
    private String telephone;

    private String datepost;


    public Job(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getIg(){
        return id;
    }

    public Job(Long id, String user, String jobTitle, String location, String telephone,String datepost) {
        this.id = id;
        this.user = user;
        this.jobTitle = jobTitle;
        this.location = location;
        this.telephone = telephone;
        this.datepost = datepost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getDatepost() {
        return datepost;
    }

    public void setDatepost(String datepost) {
        this.datepost = datepost;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", location='" + location + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
