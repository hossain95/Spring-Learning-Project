package com.example.relationship.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    List<Student> listStudent(){
        return studentRepository.findAll();
    }
}
