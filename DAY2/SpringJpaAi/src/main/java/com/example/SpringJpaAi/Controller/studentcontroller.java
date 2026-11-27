package com.example.SpringJpaAi.Controller;

import java.util.List;

import com.example.SpringJpaAi.Model.Student;
import com.example.SpringJpaAi.Service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class studentcontroller {

    @Autowired
    StudentService s;

    @GetMapping("/students")
    public List<Student> getAllStudent() {
        return s.getStudents();
    }

    @PostMapping("/students")
    public String addStudent(@RequestBody Student std) {
        s.addStudents(std);
        return "added";
    }
    // Delete student by ID
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {
        s.deleteStudentById(id);
        return "Student deleted";
    }

    // Delete all students
    @DeleteMapping("/students")
    public String deleteAllStudents() {
        s.deleteAllStudents();
        return "All students deleted";
    }
    @PutMapping("students")
    public String updateStudent(@RequestBody Student std){
        s.updateStudents(std);
        return "Student Updated";
    }
    @GetMapping("student/technology/{tech}")
    public List<Student>getStudentsByTechnology(@PathVariable("tech") String str){
        return s.getStudentByTechnology(str);
    }
}