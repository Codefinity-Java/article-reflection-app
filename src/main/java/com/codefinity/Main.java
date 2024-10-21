package com.codefinity;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Student student = new Student("John Doe", "Grade 12", 20);
        RandomNumberInjector.injectRandomNumbers(student);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Grade: " + student.getGrade());
        System.out.println("Random Age: " + student.getAge());
        System.out.println("Random Score: " + student.getScore());
    }
}