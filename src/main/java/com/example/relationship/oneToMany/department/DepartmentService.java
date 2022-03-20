package com.example.relationship.oneToMany.department;

import com.example.relationship.oneToMany.student.Student;
import com.example.relationship.oneToMany.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private StudentRepository studentRepository;

    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }

    public List<Department> listDepartment(){
        return departmentRepository.findAll();
    }
    public Department departmentByName(String name){
        return departmentRepository.departmentByName(name);
    }

    public Department studentAdmitById(Long studentId, Long departmentId){
        Department dept = departmentRepository.findById(departmentId).get();
        Student std = studentRepository.findById(studentId).get();
        std.setDepartment(dept);
        studentRepository.save(std);
        return departmentRepository.findById(departmentId).get();
    }
}
