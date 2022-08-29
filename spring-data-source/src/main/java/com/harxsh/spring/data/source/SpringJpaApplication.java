package com.harxsh.spring.data.source;

import com.harxsh.spring.data.source.entity.Student;
import com.harxsh.spring.data.source.jpa.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

//@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Student by id - {}", studentRepository.findById(2));
        logger.info("Student insert - {}", studentRepository.saveOrUpdate(
                new Student("New Student", "unknown", new Date())));
        logger.info("Student update - {}", studentRepository.saveOrUpdate(
                new Student(3, "Harxsh", "Bangalore", new Date())));
        studentRepository.deleteById(1);
        logger.info("Student list - {}", studentRepository.findAll());
    }
}