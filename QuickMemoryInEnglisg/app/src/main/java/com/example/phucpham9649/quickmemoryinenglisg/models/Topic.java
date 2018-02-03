package com.example.phucpham9649.quickmemoryinenglisg.models;

/**
 * Created by Phuc Pham on 1/28/2018.
 */

public class Topic {
    private int idTopic;
    private String name;

    public Topic(int idTopic, String name) {
        this.idTopic = idTopic;
        this.name = name;
    }

    public int getIdTopic() {
        return idTopic;
    }

    public void setIdTopic(int idTopic) {
        this.idTopic = idTopic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "idTopic=" + idTopic +
                ", name='" + name + '\'' +
                '}';
    }

}
