package com.harxsh.spring.data.source;

import com.harxsh.spring.data.source.entity.Student;
import com.harxsh.spring.data.source.jdbc.StudentJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import java.util.Date;

//@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    StudentJdbcDao studentJdbcDao;

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Student by id - {}", studentJdbcDao.findById(2));
        logger.info("Student delete - {}", studentJdbcDao.deleteById(3));
        logger.info("Student insert - {}", studentJdbcDao.insert(
                new Student(3, "Joshi Harish", "KTM", new Date())));
        logger.info("Student update - {}", studentJdbcDao.update(
                new Student(3, "Harxsh", "Bangalore", new Date())));
        logger.info("Student list - {}", studentJdbcDao.findAll());
    }
}
