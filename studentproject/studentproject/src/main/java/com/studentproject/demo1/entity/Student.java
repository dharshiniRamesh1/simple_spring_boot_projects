package com.studentproject.demo1.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table(name="tbl_student",
uniqueConstraints=@UniqueConstraint(name="email_unique",columnNames="email_address"))
public class Student {
	@Id
	@SequenceGenerator(name="student_sequence",sequenceName="student_sequence",allocationSize=1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator="student_sequence")
	
private Long studentId;
//	@NotBlank(message="Must pass value")
//	@Length(min=5,max=10,message="Name must between 5 to 10")

	private String studentName;
	@Column(name="email_address",nullable = false)
	private String emailId;
	@Embedded
	private Guardian  guardian;
	
	private String studentAddress;
   // @Positive(message="onlypositive")
	private int Marks;

public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	


}

	
	
	


