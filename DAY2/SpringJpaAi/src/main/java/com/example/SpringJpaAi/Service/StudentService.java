package com.example.SpringJpaAi.Service;

import com.example.SpringJpaAi.Model.Student;
import com.example.SpringJpaAi.Repo.StudentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo r;

    public List<Student> getStudents() {
        return r.findAll();
    }

    public void addStudents(Student std) {
        r.save(std);
    }
    public void deleteStudentById(int id) {
        r.deleteById(id);
    }

    public void deleteAllStudents() {
        r.deleteAll();
    }

    public void updateStudents(Student std) {
        r.save(std);
    }
    public List<Student> getStudentByTechnology(String str) {
        return r.findByDepartment(str);
    }
}