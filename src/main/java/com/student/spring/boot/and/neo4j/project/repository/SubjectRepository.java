package com.student.spring.boot.and.neo4j.project.repository;

import com.student.spring.boot.and.neo4j.project.entity.Subject;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends Neo4jRepository<Subject, Long> {
}
