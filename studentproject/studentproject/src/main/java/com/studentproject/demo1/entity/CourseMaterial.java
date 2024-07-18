package com.studentproject.demo1.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Builder;


@Builder
public class CourseMaterial {
	@Id
	@SequenceGenerator(
			name = "course_material_sequence",
			sequenceName = "course_material_sequence",
			allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
	generator ="course_material_sequence" )
	
	private Long courseMaterialId;
	private String materialName;
	
	@OneToOne(
			cascade = CascadeType.ALL,
			fetchn= FetchType.LAZY,optional = false)
	@JoinColumn(name = "course_id")
	
	

}
