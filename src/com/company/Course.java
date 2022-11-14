package com.company;

public class Course {
    private String name;
    private String topic;
    private String teacherLastName;
    private String teacherFirstName;
    private int numberOfParticipants;
    public boolean hasParticipants;

    public Course (String name, String topic, String teacherLastName, String teacherFirstName, int numberOfParticipants) {
        this.name = name;
        this.topic = topic;
        this.teacherLastName = teacherLastName;
        this.teacherFirstName = teacherFirstName;
        this.numberOfParticipants = numberOfParticipants;

        if (numberOfParticipants <= 0)
            hasParticipants = false;
        else
            hasParticipants = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTeacherLastName (String teacherLastName, String teacherFirstName) {
        this.teacherLastName = teacherLastName;
        this.teacherFirstName = teacherFirstName;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants (int numberOfParticipants) {
        if (numberOfParticipants < 0)
            System.out.println ("no");
        else {
            this.numberOfParticipants = numberOfParticipants;
            System.out.println ("the number of participants was set to " + numberOfParticipants);
        }
    }

    public String toString() {
        return name + ", " + topic + ": " + teacherLastName + ", " + teacherFirstName + " | " + numberOfParticipants;
    }
}
