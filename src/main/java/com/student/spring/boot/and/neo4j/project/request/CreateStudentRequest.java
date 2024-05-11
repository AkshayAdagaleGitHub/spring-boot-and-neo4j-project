package com.student.spring.boot.and.neo4j.project.request;

import com.student.spring.boot.and.neo4j.project.entity.Department;
import com.student.spring.boot.and.neo4j.project.entity.IsLearningRelation;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class CreateStudentRequest {

    private List<CreateSubjectRequest> subjectRequestList;
    private Department department;
    private String name;
    private String country;
    private Integer birthYear;


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<CreateSubjectRequest> getSubjectRequestList() {
        return subjectRequestList;
    }

    public void setSubjectRequestList(List<CreateSubjectRequest> subjectRequestList) {
        this.subjectRequestList = subjectRequestList;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }
}
