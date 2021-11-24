package com.company;

public class Course {
    private String name, topic, nameOfTeacher;
    private int numberParticipants;

    public Course(String name, String topic, String nameOfTeacher, int numberParticipants) {
        this.name = name;
        this.topic = topic;
        this.nameOfTeacher = nameOfTeacher;
        this.numberParticipants = numberParticipants;
    }

    public void setName(String name) {this.name = name;}

    public String getName() {return name;}

    public void setTopic(String topic) {this.topic = topic;}

    public String getTopic() {return topic;}

    public void setNameOfTeacher(String nameOfTeacher) {this.nameOfTeacher = nameOfTeacher;}

    public String getNameOfTeacher() {return nameOfTeacher;}

    public void setNumberParticipants(int numberParticipants) {
        this.numberParticipants = numberParticipants;
        if (numberParticipants < 0)
            System.out.println("There is a negative amount of participants.");
    }

    public int getNumberParticipants() {return numberParticipants;}

    public boolean hasParticipants() {
        return numberParticipants >= 0;
    }
}
