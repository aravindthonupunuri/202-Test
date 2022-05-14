package edu.sjsu.assasins.hotelbooking.models;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection ="customers")
public class Customer{
    @Id
    private String email;
    private String password;
    private String name;
    private Boolean isAdmin;
    private int rewardPoints;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public Customer() {
    }

    public Customer(String email, String password, String name, Boolean isAdmin, int rewardPoints) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.isAdmin = isAdmin;
        this.rewardPoints = rewardPoints;
    }
}