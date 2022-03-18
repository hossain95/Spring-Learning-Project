package com.example.springlearningproject.service;

import com.example.springlearningproject.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> allStudent();
    Optional<Student> getStudentById(Long id);
    Student updateStudent(Student student, Long studentId);
    void deleteStudentById(Long studentId);
    Student studentByEmail(String email);
    List<Student> studentsByDepartment(String department);
    Student studentByContact(String contact);
    List<Student> studentsByName(String name);
}
