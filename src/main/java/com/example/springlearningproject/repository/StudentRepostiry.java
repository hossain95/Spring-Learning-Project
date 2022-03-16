package com.example.springlearningproject.repository;

import com.example.springlearningproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepostiry extends JpaRepository<Student, Long> {
}
