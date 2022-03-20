package com.example.relationship.manyToMany.subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public Subject saveSubject(Subject subject){
        return subjectRepository.save(subject);
    }

    public List<Subject> listSubjects(){
        return subjectRepository.findAll();
    }
}
