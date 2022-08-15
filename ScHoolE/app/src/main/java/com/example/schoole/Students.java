package com.example.schoole;

public class Students {
    private String StudentName;
    private int studentGreed;
    private int studentAge;
    private int studintPhoto;

    public Students(String studentName, int studentGreed, int studentAge, int studintPhoto) {
        StudentName = studentName;
        this.studentGreed = studentGreed;
        this.studentAge = studentAge;
        this.studintPhoto = studintPhoto;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getStudentGreed() {
        return studentGreed;
    }

    public void setStudentGreed(int studentGreed) {
        this.studentGreed = studentGreed;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudintPhoto() {
        return studintPhoto;
    }

    public void setStudintPhoto(int studintPhoto) {
        this.studintPhoto = studintPhoto;
    }
}