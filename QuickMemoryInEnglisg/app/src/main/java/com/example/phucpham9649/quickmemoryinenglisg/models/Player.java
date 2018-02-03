package com.example.phucpham9649.quickmemoryinenglisg.models;

/**
 * Created by Phuc Pham on 1/28/2018.
 */

public class Player {
    private int scores;
    private String name;


    public Player(int scores, String name) {
        this.scores = scores;
        this.name = name;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "scores=" + scores +
                ", name='" + name + '\'' +
                '}';
    }
}

