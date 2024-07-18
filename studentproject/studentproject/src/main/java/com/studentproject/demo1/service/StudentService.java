package com.studentproject.demo1.service;

import java.util.List;
import com.studentproject.demo1.entity.Student;
import com.studentproject.demo1.error.StudentNotFounfException;

public interface StudentService {
    Student insertStudentData(Student student);
    List<Student> fetchStudentData();
    void deleteStudentData(Long id);
    Student fetchStudentDataById(Long studentID) throws StudentNotFounfException;
    Student findByStudentName(String studentName);
    Student updateData(Long id, Student student);
}


