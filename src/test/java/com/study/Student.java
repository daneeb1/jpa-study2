package com.study;

import javax.persistence.*;
import java.util.List;

@Entity(name = "student")
@Table(name = "tbl_student")
public class Student {

    @Id
    @Column(name = "stu_code", nullable = false)
    private int stuCode; // 학생번호
    @Column(name = "name", nullable = false)
    private String name; // 학생명
    @Column(name = "phone", nullable = false, columnDefinition = "default '010-0000-0000")
    private String phone; // 전화번호
    @Column(name = "address", nullable = false)
    private String address; // 주소

    @OneToMany(mappedBy = "student")
    private List<Grades> gradesList;

    public Student() {
    }

    public Student(int stuCode, String name, String phone, String address, List<Grades> gradesList) {
        this.stuCode = stuCode;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.gradesList = gradesList;
    }

    public int getStuCode() {
        return stuCode;
    }

    public void setStuCode(int stuCode) {
        this.stuCode = stuCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Grades> getGradesList() {
        return gradesList;
    }

    public void setGradesList(List<Grades> gradesList) {
        this.gradesList = gradesList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuCode=" + stuCode +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", gradesList=" + gradesList +
                '}';
    }
}
