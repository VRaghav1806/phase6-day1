package com.example.SpringJpaAi.Repo;

import com.example.SpringJpaAi.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Integer> {
    List<Student> findByDepartment(String department);
}
