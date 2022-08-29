package com.harxsh.spring.data.source.springdata ;

import com.harxsh.spring.data.source.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentSpringDataRepository extends JpaRepository<Student, Integer> {
}
