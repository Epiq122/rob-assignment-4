package com.coderscampus;

public class Students implements Comparable<Students> {

    private Integer studentId;
    private Integer studentGrade;
    private String course;
    private Integer grade;

    public Students(int studentId, String studentGrade, String course, int grade) {
        this.studentId = studentId;
        this.studentGrade = Integer.valueOf(studentGrade);
        this.course = course;
        this.grade = grade;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(Integer studentGrade) {
        this.studentGrade = studentGrade;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }


    @Override
    public int compareTo(Students o) {
        return 0;
    }
}
