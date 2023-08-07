package com.study;

import javax.persistence.*;

@Entity(name = "grades")
@Table(name = "tbl_grades")
public class Grades {

    @EmbeddedId
    private GradesPk gradesPk;
    @ManyToOne
    @JoinColumn(name = "sub_code")
    private Course course; // 과목번호
    @ManyToOne
    @JoinColumn(name = "stu_code")
    private Student student; // 학생번호
    @Column(name = "semester", nullable = false)
    private String semester; //학기
    @Column(name = "score", nullable = false)
    private int score; // 과목점수

    public Grades() {
    }

    public Grades(GradesPk gradesPk, Course course, Student student, String semester, int score) {
        this.gradesPk = gradesPk;
        this.course = course;
        this.student = student;
        this.semester = semester;
        this.score = score;
    }

    public Grades semester(String semester){
        this.semester = semester;
        return this;
    }

    public Grades score(int score){
        this.score = score;
        return this;
    }

    public Grades builder(){
        return new Grades(gradesPk, course, student, semester, score);
    }

    public GradesPk getGradesPk() {
        return gradesPk;
    }

    public void setGradesPk(GradesPk gradesPk) {
        this.gradesPk = gradesPk;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}
