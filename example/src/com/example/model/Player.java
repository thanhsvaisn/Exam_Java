package com.example.model;

public class Player {
    private int playerId;
    private String name;
    private String fullName;
    private String age;
    private int indexId;

    // Default constructor
    public Player() {}

    // Parameterized constructor
    public Player(int playerId, String name, String fullName, String age, int indexId) {
        this.playerId = playerId;
        this.name = name;
        this.fullName = fullName;
        this.age = age;
        this.indexId = indexId;
    }

    // Getters
    public int getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAge() {
        return age;
    }

    public int getIndexId() {
        return indexId;
    }

    // Setters
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    // toString() for easy printing
    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age='" + age + '\'' +
                ", indexId=" + indexId +
                '}';
    }
}

