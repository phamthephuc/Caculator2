package com.example.phucpham9649.quickmemoryinenglisg.models;

/**
 * Created by Phuc Pham on 1/28/2018.
 */

public class Lesson {
    private int idLesson;
    private int idTopic;

    public Lesson(int idLesson, int idTopic) {
        this.idLesson = idLesson;
        this.idTopic = idTopic;
    }

    public int getIdLesson() {
        return idLesson;
    }

    public void setIdLesson(int idLesson) {
        this.idLesson = idLesson;
    }

    public int getIdTopic() {
        return idTopic;
    }

    public void setIdTopic(int idTopic) {
        this.idTopic = idTopic;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "idLesson=" + idLesson +
                ", idTopic=" + idTopic +
                '}';
    }
}
