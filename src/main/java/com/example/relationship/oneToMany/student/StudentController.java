package com.example.relationship.oneToMany.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;


    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student){
//        System.out.println(student.getName());
        return studentService.saveStudent(student);
    }

    @GetMapping("/students")
    public List<Student> listStudent(){
        return studentService.listStudent();
    }
}
