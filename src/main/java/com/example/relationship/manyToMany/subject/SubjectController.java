package com.example.relationship.manyToMany.subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {
    @Autowired
    private SubjectService subjectService;


    @PostMapping("/subjects")
    public Subject saveSubject(@RequestBody Subject subject){
        return subjectService.saveSubject(subject);
    }

    @GetMapping("/subjects")
    public List<Subject> listSubject(){
        return subjectService.listSubjects();
    }
}
