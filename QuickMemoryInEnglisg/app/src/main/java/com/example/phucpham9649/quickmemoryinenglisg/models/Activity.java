package com.example.phucpham9649.quickmemoryinenglisg.models;

/**
 * Created by Phuc Pham on 1/28/2018.
 */


public abstract class Activity {
    private int idLesson;
    private int score;


    public Activity(int idLesson, int score) {
        this.idLesson = idLesson;
        this.score = score;
    }

    public int getIdLesson() {
        return idLesson;
    }

    public void setIdLesson(int idLesson) {
        this.idLesson = idLesson;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Step{" +
                "idLesson=" + idLesson +
                ", score=" + score +
                '}';
    }

    public abstract int gotPoint();

    public abstract void show();
}

