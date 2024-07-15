package com.studentproject.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.studentproject.demo1.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByStudentName(String studentName);
}


