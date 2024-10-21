package com.codefinity;

public class Student {
    private String name;
    private String grade;
    @RandomNumber(min=1, max=100)
    private int score;
    private int age;

    public Student(String name, String grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
}
