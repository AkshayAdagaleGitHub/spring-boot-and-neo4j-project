package com.student.spring.boot.and.neo4j.project.service;

import com.student.spring.boot.and.neo4j.project.entity.Department;
import com.student.spring.boot.and.neo4j.project.entity.IsLearningRelation;
import com.student.spring.boot.and.neo4j.project.entity.Student;
import com.student.spring.boot.and.neo4j.project.entity.Subject;
import com.student.spring.boot.and.neo4j.project.repository.DepartmentRepository;
import com.student.spring.boot.and.neo4j.project.repository.StudentRepository;
import com.student.spring.boot.and.neo4j.project.repository.SubjectRepository;
import com.student.spring.boot.and.neo4j.project.request.CreateStudentRequest;
import com.student.spring.boot.and.neo4j.project.request.CreateSubjectRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    SubjectRepository subjectRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    public Student createStudent(CreateStudentRequest createStudentRequest){
        Department department = new Department();
        department.setDepName(createStudentRequest.getDepartment().getDepName());
        departmentRepository.save(department);

        List<IsLearningRelation> isLearningRelationList = new ArrayList<>();

        if(createStudentRequest.getSubjectRequestList() != null){
            List<CreateSubjectRequest> createSubjectRequestList = createStudentRequest.getSubjectRequestList();


            for(CreateSubjectRequest subjectRequest : createSubjectRequestList){
                Subject subject = new Subject();
                subject.setSubName(subjectRequest.getName());

                IsLearningRelation isLearningRelation = new IsLearningRelation();
                isLearningRelation.setMarks(subjectRequest.getMarks());
                isLearningRelation.setSubject(subject);
//                student.getIsLearningRelations().add(isLearningRelation);
                isLearningRelationList.add(isLearningRelation);
            }

        }


        Student student = new Student();
        student.setName(createStudentRequest.getName());
        student.setCountry(createStudentRequest.getCountry());
        student.setBirthYear(createStudentRequest.getBirthYear());
        student.setDepartment(department);
        student.setIsLearningRelations(isLearningRelationList);
        studentRepository.save(student);

        return student;
    }
}
