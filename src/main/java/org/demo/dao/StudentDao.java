package org.demo.dao;

import org.demo.model.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getAllStudents();
    Student getStudent(int rollNo);
    void updateStudent(Student student);
    void deleteStudent(Student student);
}
