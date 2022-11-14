package com.company;

public class hw4 {
    public static void main(String[] args) {
        Course course = new Course ("hi3", "history", "me", "po", 29);
        course.setNumberOfParticipants (22);

        System.out.println (course);
        System.out.println(course.hasParticipants);
    }
}
