package com.studentproject.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.studentproject.demo1.entity.Student;
//import com.studentproject.demo1.service.StudentNotFounfException;
import com.studentproject.demo1.service.StudentService;
import com.studentproject.demo1.error.*;


@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/savedata")
    public Student insertStudentData(@RequestBody Student student) {
        System.out.println("The student is " + student.getStudentName());
        return studentService.insertStudentData(student);
    }

    @GetMapping("/getStudentDetails")
    public List<Student> getStudentData() {
        return studentService.fetchStudentData();
    }

    @GetMapping("/getStudentDetails/{studentid}")
    public Student getStudentById(@PathVariable Long studentid)throws StudentNotFounfException  {
        return studentService.fetchStudentDataById(studentid);
    }

    @DeleteMapping("/getstudentdelete/{id}")
    public void deleteStudentData(@PathVariable Long id) {
        System.out.println("The record is deleting... " + id);
        studentService.deleteStudentData(id);
    }

    @GetMapping("/getstudentdetailsbyname/{name}")
    public Student findByName(@PathVariable("name") String studentName) {
        System.out.print("The name is " + studentName);
        return studentService.findByStudentName(studentName);
    }

    @PutMapping("/updatestudentdata/{id}")
    public Student updateStudentData(@PathVariable Long id, @RequestBody Student student) {
        return studentService.updateData(id, student);
    }
}
