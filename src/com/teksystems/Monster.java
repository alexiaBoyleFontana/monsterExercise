package com.teksystems;

public class Monster {
    private String name;

    Monster (String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String attack() {
        return "!^_&amp;^$@+%$* I don&#39;t know how to attack!";
    }
}

