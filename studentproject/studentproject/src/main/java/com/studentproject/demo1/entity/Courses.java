package com.studentproject.demo1.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Builder
@Table(name="course")

public class Courses {
	@Id
	@SequenceGenerator(name="course_sequence",sequenceName="course_sequence",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long courseId;
	private String courseName;
	private Long courseFee;

}
