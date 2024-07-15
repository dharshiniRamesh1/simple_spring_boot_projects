package com.studentproject.demo1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentproject.demo1.entity.Student;
import com.studentproject.demo1.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student insertStudentData(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> fetchStudentData() {
        return studentRepository.findAll();
    }

    @Override
    public Student fetchStudentDataById(Long studentID) {
        Optional<Student> studentOptional = studentRepository.findById(studentID);
        return studentOptional.orElse(null);
    }

    @Override
    public void deleteStudentData(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findByStudentName(String studentName) {
        return studentRepository.findByStudentName(studentName);
    }

    @Override
    public Student updateData(Long id, Student student) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (studentOptional.isPresent()) {
            Student studentDB = studentOptional.get();
            studentDB.setStudentName(student.getStudentName());
            studentDB.setStudentAddress(student.getStudentAddress());
            studentDB.setMarks(student.getMarks());
            return studentRepository.save(studentDB);
        }
        return null;
    }
}




