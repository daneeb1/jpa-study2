package com.study;

import javax.persistence.*;
import java.util.List;

@Entity(name = "course")
@Table(name = "tbl_course")
public class Course {

    @Id
    @Column(name = "sub_code", nullable = false)
    private int subCode; // 과목번호
    @Column(name = "subject", nullable = false)
    private int subject; // 과목명

    @OneToMany(mappedBy = "course")
    private List<Grades> gradesList;

    public Course() {
    }

    public Course(int subCode, int subject, List<Grades> gradesList) {
        this.subCode = subCode;
        this.subject = subject;
        this.gradesList = gradesList;
    }

    public int getSubCode() {
        return subCode;
    }

    public void setSubCode(int subCode) {
        this.subCode = subCode;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }

    public List<Grades> getGradesList() {
        return gradesList;
    }

    public void setGradesList(List<Grades> gradesList) {
        this.gradesList = gradesList;
    }
    
    @Override
    public String toString() {
        return "Course{" +
                "subCode=" + subCode +
                ", subject=" + subject +
                ", gradesList=" + gradesList +
                '}';
    }
}
