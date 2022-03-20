package com.example.relationship.department;

import com.example.relationship.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }

    public List<Department> listDepartment(){
        return departmentRepository.findAll();
    }
    public Department departmentByName(String name){
        return departmentRepository.departmentByName(name);
    }
}
