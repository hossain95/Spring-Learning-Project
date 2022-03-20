package com.example.relationship.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> listDepartment(){
        return departmentService.listDepartment();
    }
    @GetMapping("/departments/name")
    public Department departmentByName(@RequestParam String name){
        return departmentService.departmentByName(name);
    }
}
