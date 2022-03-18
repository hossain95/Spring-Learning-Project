package com.example.springlearningproject.service;

import com.example.springlearningproject.entity.Student;
import com.example.springlearningproject.repository.StudentRepostiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImplement implements StudentService{
    @Autowired
    private StudentRepostiry studentRepostiry;

    @Override
    public Student saveStudent(Student student) {
        return studentRepostiry.save(student);
    }

    @Override
    public List<Student> allStudent() {
        return studentRepostiry.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentRepostiry.findById(id);
    }

    @Override
    public Student updateStudent(Student student, Long studentId) {
        Student std = studentRepostiry.findById(studentId).get();
        std.setName(student.getName());
        std.setDepartment(student.getDepartment());
        std.setEmail(student.getEmail());
        std.setContact(student.getContact());
        std.setAddress(student.getAddress());
        return studentRepostiry.save(std);
    }

    @Override
    public void deleteStudentById(Long studentId) {
        studentRepostiry.deleteById(studentId);
    }

    @Override
    public Student studentByEmail(String email) {
        return studentRepostiry.studentByEmail(email);
    }

    @Override
    public List<Student> studentsByDepartment(String department) {
        return studentRepostiry.studentsFindByDepartment(department);
    }

    @Override
    public Student studentByContact(String contact) {
//        System.out.println(contact);
        return studentRepostiry.studentByContact(contact);
    }

    @Override
    public List<Student> studentsByName(String name) {
//        System.out.println(name);
        return studentRepostiry.studentsFindByName(name);
    }
}
