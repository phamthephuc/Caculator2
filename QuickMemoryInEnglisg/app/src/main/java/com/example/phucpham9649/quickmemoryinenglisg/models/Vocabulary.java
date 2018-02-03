package com.example.phucpham9649.quickmemoryinenglisg.models;

/**
 * Created by Phuc Pham on 1/28/2018.
 */

public class Vocabulary {
    private String word;
    private String pronounce;
    private String sound;
    private String picture;
    private String mean;
    private int idTopic;
    private int idLesson;

    public Vocabulary(String word, String pronounce, String sound, String picture, String mean, int idTopic,int idLesson) {
        this.word = word;
        this.pronounce = pronounce;
        this.sound = sound;
        this.picture = picture;
        this.mean = mean;
        this.idTopic = idTopic;
        this.idLesson = idLesson;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPronounce() {
        return pronounce;
    }

    public void setPronounce(String pronounce) {
        this.pronounce = pronounce;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public int getIdTopic() {
        return idTopic;
    }

    public void setIdTopic(int idTopic) {
        this.idTopic = idTopic;
    }

    public int getIdLesson() {
        return idLesson;
    }

    public void setIdLesson(int idLesson) {
        this.idLesson = idLesson;
    }

    @Override
    public String toString() {
        return "Vocabulary{" +
                "word='" + word + '\'' +
                ", pronounce='" + pronounce + '\'' +
                ", sound='" + sound + '\'' +
                ", picture='" + picture + '\'' +
                ", mean='" + mean + '\'' +
                ", idTopic=" + idTopic +
                ", idLesson=" + idLesson +
                '}';
    }
}
