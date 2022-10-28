package com.example.BLUE.COLLAR.SERVICE.model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Data


public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    @NotBlank(message="first cant be blank or empty")
    @Size(min=2,max=30)
    private String firstname;
    @NotBlank(message="lastname cant be blank or empty")
    @Size(min=2,max=30)
    @Column(nullable = false)
    private String lastname;
    @Size(min=2,max=30)
    @NotBlank(message="email cant be blank or empty")
    @Column(nullable = false)
    private String email;
    @Size(min=2,max=30)
    @Column(nullable = false)
    private String password;
    @Transient
    private String confirmpassword;

    public User( String firstname, String lastname, String email, String password, String confirmpassword) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.confirmpassword = confirmpassword;
    }

//    public User() {
//
//    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", confirmpassword='" + confirmpassword + '\'' +
                '}';
    }
}
