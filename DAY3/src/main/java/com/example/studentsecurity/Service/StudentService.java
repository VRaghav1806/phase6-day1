package com.example.studentsecurity.Service;

import com.example.studentsecurity.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(new Student(1, "Arun Kumar", "arun@example.com", "Computer Science"));
        students.add(new Student(2, "Priya Devi", "priya@example.com", "Electronics"));
    }

    // CREATE
    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    // READ ALL
    public List<Student> getAllStudents() {
        return students;
    }

    // READ ONE
    public Student getStudentById(int id) {
        for (int i = 0; i < students.size(); i++) {
            Student current = students.get(i);
            if (current.getId() == id) {
                return current;
            }
        }
        return null;
    }

    // UPDATE
    public Student updateStudent(int id, Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            Student current = students.get(i);
            if (current.getId() == id) {
                current.setName(updatedStudent.getName());
                current.setEmail(updatedStudent.getEmail());
                current.setCourse(updatedStudent.getCourse());
                return current;
            }
        }
        return null;
    }

    // DELETE
    public boolean deleteStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            Student current = students.get(i);
            if (current.getId() == id) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }
}
