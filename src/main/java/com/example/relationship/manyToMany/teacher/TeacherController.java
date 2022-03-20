package com.example.relationship.manyToMany.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;


    @PostMapping("/teachers")
    public Teacher saveTeacher(@RequestBody Teacher teacher){
        return teacherService.saveTeacher(teacher);
    }

    @GetMapping("teachers")
    public List<Teacher> listTeacher(){
        return teacherService.listTeacher();
    }
}
