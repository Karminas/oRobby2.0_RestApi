package com.UserApi.demo.Models;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull private String name;
    @NotNull private String lastName;
    @NotNull private String userName;
    @NotNull private String password;
    @NotNull private String email;

    public User(){}

    public User(String pName, String pLastName, String pUserName, String pEmail){
        this.name = pName;
        this.lastName = pLastName;
        this.userName = pUserName;
        this.email = pEmail;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getUserName() {return userName;}
    public void setUserName(String userName) {this.userName = userName;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
}
