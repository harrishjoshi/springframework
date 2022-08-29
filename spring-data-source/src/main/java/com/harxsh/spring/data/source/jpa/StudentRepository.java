package com.harxsh.spring.data.source.jpa;

import com.harxsh.spring.data.source.entity.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

// Repository
@Repository
// Transaction
@Transactional
public class StudentRepository {

    // connect to the database
    @PersistenceContext
    EntityManager entityManager;

    public Student findById(int id) {
        return entityManager.find(Student.class, id);
    }

    public Student saveOrUpdate(Student student) {
        return entityManager.merge(student);
    }

    public void deleteById(int id) {
        Student student = findById(id);
        entityManager.remove(student);
    }

    public List<Student> findAll() {
        TypedQuery<Student> namedQuery = entityManager.createNamedQuery("find_all_students", Student.class);
        return namedQuery.getResultList();
    }
}