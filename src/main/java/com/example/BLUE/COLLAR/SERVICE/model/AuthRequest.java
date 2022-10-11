package com.example.BLUE.COLLAR.SERVICE.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest {

    private String firstname ;
    private String password;

}
