package com.example.phucpham9649.quickmemoryinenglisg.controllers;

import com.example.phucpham9649.quickmemoryinenglisg.models.Lesson;
import com.example.phucpham9649.quickmemoryinenglisg.models.Topic;
import com.example.phucpham9649.quickmemoryinenglisg.models.Vocabulary;

import java.util.ArrayList;

/**
 * Created by Phuc Pham on 1/28/2018.
 */

public class TopicManage {

    private ArrayList<Topic> mListTopic;
    private ArrayList<Lesson> mListLesson;
    private ArrayList<Vocabulary> mListVocabulary;
    public static TopicManage sTopicManage;

    private TopicManage() {
        this.mListTopic = new ArrayList<Topic>();
        this.mListLesson = new ArrayList<Lesson>();
    }

    public ArrayList<Topic> getTopics()
    {
        ArrayList<Topic> listTopic = new ArrayList<>();


        return listTopic;
    }

    public ArrayList<Lesson> getLessons(int idTopic)
    {
        ArrayList<Lesson> listLesson = new ArrayList<>();


        return listLesson;
    }

    public  ArrayList<Vocabulary> getVocabularies(int idLesson){
        ArrayList<Vocabulary> listvocabularies = new ArrayList<>();


        return listvocabularies;
    }
}
