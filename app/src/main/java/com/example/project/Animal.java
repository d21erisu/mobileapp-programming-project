package com.example.project;

public class Animal {

    private String ID;
    private String Login;
    private String name;
    private String race;
    private String type;
    private String diet;
    private int weight;

    public Animal(String ID, String login, String name, String race, String type, String diet, int weight) {
        this.ID = ID;
        Login = login;
        this.name = name;
        this.race = race;
        this.type = type;
        this.diet = diet;
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

    public String getRace() {
        return race;
    }

    public String getType() {
        return type;
    }

    public String getDiet() {
        return diet;
    }

    public int getWeight() {
        return weight;
    }
}
