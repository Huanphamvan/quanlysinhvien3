package model;

import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private String gender;
    private double pointsAvg;

    public Student(int id, String name, String gender, double pointsAvg) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.pointsAvg = pointsAvg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPointsAvg() {
        return pointsAvg;
    }

    public void setPointsAvg(double pointsAvg) {
        this.pointsAvg = pointsAvg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", pointsAvg=" + pointsAvg +
                '}';
    }
}
