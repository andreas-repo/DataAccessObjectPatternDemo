package org.demo.dao.impl;

import org.demo.dao.StudentDao;
import org.demo.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private List<Student> students;

    public StudentDaoImpl() {
        this.students = new ArrayList<>();
        Student student1 = new Student("Robert",0);
        Student student2 = new Student("John",1);
        students.add(student1);
        students.add(student2);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return this.students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        this.students.get(student.getRollNo()).setName(student.getName());
    }

    @Override
    public void deleteStudent(Student student) {
        this.students.remove(student);
    }
}
