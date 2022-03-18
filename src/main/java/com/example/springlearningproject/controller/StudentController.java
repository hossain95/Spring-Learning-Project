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
//        System.out.println(studentService.getStudentById(id));
        return studentService.getStudentById(id);
    }
    @GetMapping("/students/email")
    @ResponseBody
    public Student studentByEmail(@RequestParam String email){
//        System.out.println("email, "+ email);
        return studentService.studentByEmail(email);
    }

    @GetMapping("/students/contact")
    @ResponseBody
    public Student studentByContact(@RequestParam String contact){
//        System.out.println(contact);
        return studentService.studentByContact(contact);
    }

    @GetMapping("/students/department")
    @ResponseBody
    public List<Student> studentsByDepartment(@RequestParam String department){
        return studentService.studentsByDepartment(department);
    }

    @GetMapping("/students/name")
    @ResponseBody
    public List<Student> studentsByName(@RequestParam String name){
        return studentService.studentsByName(name);
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
