package com.student.spring.boot.and.neo4j.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EntityScan("com.student.spring.boot.and.neo4j.project.entity")
@EnableNeo4jRepositories("com.student.spring.boot.and.neo4j.project.repository")
public class SpringBootAndNeo4jProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAndNeo4jProjectApplication.class, args);
	}

}
