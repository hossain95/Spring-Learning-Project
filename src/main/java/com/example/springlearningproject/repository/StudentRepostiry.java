package com.example.springlearningproject.repository;

import com.example.springlearningproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepostiry extends JpaRepository<Student, Long> {
    @Query("select s from student s where s.email = ?1")
    Student studentByEmail(String email);

    @Query("select s from student s where s.contact = ?1")
    Student studentByContact(String contact);

    @Query("select s from student s where s.department = ?1")
    List<Student> studentsFindByDepartment(String department);

    @Query("select s from student s where s.name = ?1")
    List<Student> studentsFindByName(String name);

}
