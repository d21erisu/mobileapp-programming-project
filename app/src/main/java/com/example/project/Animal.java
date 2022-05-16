package com.example.project;

public class Animal {

    private String ID;
    private String Login;
    private String name;
    private String type;
    private int weight;

    public Animal(String ID, String login, String name, String race, String type, int weight) {
        this.ID = ID;
        Login = login;
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    public String getID() {
        return ID;
    }

    public String getLogin() {
        return Login;
    }

    public String getName() {
        return name;
    }


    public String getType() {
        return type;
    }


    public int getWeight() {
        return weight;
    }
}
