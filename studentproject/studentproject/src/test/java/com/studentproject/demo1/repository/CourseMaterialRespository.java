package com.studentproject.demo1.repository;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.studentproject.demo1.entity.CourseMaterial;

@SpringBootTest
public interface CourseMaterialRespository {
	@Test
	public static  void courseMaterial() {
		Courses courses = Courses.builder().materialName("java").course(course).build();
		
		CourseMaterial coursematerial = CourseMaterial.builder().materialName("java").course(course).build();
	}

}
