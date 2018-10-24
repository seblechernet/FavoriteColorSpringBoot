package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class User {

    private String[] questions;
    private String name;
    private String quest;


    public User() {
        questions=new String[3];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String[] getQuestions() {
        return questions;
    }

    public void setQuestions(String[] questions) {
        this.questions = questions;
    }

    public String randomGenerator(){
        questions[0]="What is yor favorite Color?";
        questions[1]="What is the airspeed velocity of an unladen swallow?";
        questions[2]="What shall i ask you?";
        Random rd=new Random();
        int index= rd.nextInt(3);


        return questions[index];
    }
}
