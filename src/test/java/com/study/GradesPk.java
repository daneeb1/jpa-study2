package com.study;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class GradesPk implements Serializable {

    @Column(name = "sub_code")
    private int subCode; // 과목번호
    @Column(name = "stu_code")
    private int stuCode; // 학생번호

    public GradesPk() {
    }

    public GradesPk(int subCode, int stuCode) {
        this.subCode = subCode;
        this.stuCode = stuCode;
    }

    public int getSubCode() {
        return subCode;
    }

    public void setSubCode(int subCode) {
        this.subCode = subCode;
    }

    public int getStuCode() {
        return stuCode;
    }

    public void setStuCode(int stuCode) {
        this.stuCode = stuCode;
    }

    @Override
    public String toString() {
        return "GradesPk{" +
                "subCode=" + subCode +
                ", stuCode=" + stuCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GradesPk gradesPk = (GradesPk) o;
        return subCode == gradesPk.subCode && stuCode == gradesPk.stuCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(subCode, stuCode);
    }
}
