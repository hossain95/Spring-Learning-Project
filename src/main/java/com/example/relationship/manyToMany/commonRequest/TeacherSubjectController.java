package com.example.relationship.manyToMany.commonRequest;

import com.example.relationship.manyToMany.subject.SubjectRepository;
import com.example.relationship.manyToMany.subject.SubjectService;
import com.example.relationship.manyToMany.teacher.Teacher;
import com.example.relationship.manyToMany.teacher.TeacherRepository;
import com.example.relationship.manyToMany.teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherSubjectController {
    @Autowired
    private TeacherSubjectService teacherSubjectService;

    @PutMapping("/teachers/take-subject")
    public Teacher takenSubject(@RequestParam(name = "teacherId") Long teacherId, @RequestParam(name = "subjectId") Long subjectId){
        return teacherSubjectService.takenSubject(teacherId, subjectId);
    }
}
