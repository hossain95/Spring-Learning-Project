package com.example.relationship.manyToMany.commonRequest;

import com.example.relationship.manyToMany.subject.Subject;
import com.example.relationship.manyToMany.subject.SubjectRepository;
import com.example.relationship.manyToMany.teacher.Teacher;
import com.example.relationship.manyToMany.teacher.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Service
public class TeacherSubjectService {
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private SubjectRepository subjectRepository;

    public Teacher takenSubject(Long teacherId, Long subjectId){
        Teacher teacher = teacherRepository.findById(teacherId).get();
        Subject subject = subjectRepository.findById(subjectId).get();
        Set<Subject> subjects = new HashSet<>();
        subjects = teacher.getSubjects();
        subjects.add(subject);
        teacher.setSubjects(subjects);
        return teacherRepository.save(teacher);
    }
}
