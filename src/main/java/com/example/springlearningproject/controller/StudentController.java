package com.example.springlearningproject.controller;

import com.example.springlearningproject.entity.Student;
import com.example.springlearningproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/students")
    public List<Student> allStudents(){
        return studentService.allStudent();
    }

    @GetMapping("/students/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id){
        System.out.println(studentService.getStudentById(id));
        return studentService.getStudentById(id);
    }

    @PutMapping("/students/{studentId}")
    public Student updateStudentById(@RequestBody Student student,@PathVariable("studentId") Long studentId){
        return studentService.updateStudent(student, studentId);
    }

    @DeleteMapping("/students/{studentId}")
    public void deleteStudent(@PathVariable Long studentId){
        studentService.deleteStudentById(studentId);
    }
}
