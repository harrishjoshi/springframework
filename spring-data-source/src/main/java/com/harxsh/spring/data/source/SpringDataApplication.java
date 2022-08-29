package com.harxsh.spring.data.source;

import com.harxsh.spring.data.source.entity.Student;
import com.harxsh.spring.data.source.springdata.StudentSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    StudentSpringDataRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Student by id - {}", studentRepository.findById(2));
        logger.info("Student insert - {}", studentRepository.save(
                new Student("New Student", "unknown", new Date())));
        logger.info("Student update - {}", studentRepository.save(
                new Student(3, "Harxsh", "Bangalore", new Date())));
        studentRepository.deleteById(1);
        logger.info("Student list - {}", studentRepository.findAll());
    }
}