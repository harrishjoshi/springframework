package com.harxsh.spring.data.source.jdbc;

import com.harxsh.spring.data.source.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class StudentJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    class StudentRowMapper implements RowMapper<Student> {

        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setAddress(rs.getString("address"));
            student.setBirthDate(rs.getTimestamp("birth_date"));
            return student;
        }
    }

    public List<Student> findAll() {
        return jdbcTemplate.query("select * from student",
                new StudentRowMapper());
    }

    public Student findById(int id) {
        return jdbcTemplate.queryForObject(
                "select * from student where id = ?",
                new Object[]{id},
                new StudentRowMapper());
    }

    public int deleteById(int id) {
        return jdbcTemplate.update(
                "delete from student where id = ?",
                id);
    }

    public int insert(Student student) {
        return jdbcTemplate.update(
                "insert into student (id, name, address, birth_date) values (?, ?, ?, ?)",
                student.getId(), student.getName(), student.getAddress(), new Timestamp(student.getBirthDate().getTime()));
    }

    public int update(Student student) {
        return jdbcTemplate.update(
                "update student set name = ?, address = ?, birth_date = ? where id = ?",
                student.getName(), student.getAddress(), new Timestamp(student.getBirthDate().getTime()),
                student.getId());
    }
}
