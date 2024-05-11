package com.student.spring.boot.and.neo4j.project.repository;

import com.student.spring.boot.and.neo4j.project.entity.Department;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends Neo4jRepository<Department,Long> {
}
