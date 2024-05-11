package com.student.spring.boot.and.neo4j.project.request;

import org.springframework.stereotype.Component;

@Component
public class CreateSubjectRequest {

    private String name;
    private Long marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMarks() {
        return marks;
    }

    public void setMarks(Long marks) {
        this.marks = marks;
    }
}
