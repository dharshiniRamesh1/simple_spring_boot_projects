package com.studentproject.demo1.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@AttributeOverrides({
	@AttributeOverride(name= "guardianName", column=
			@Column(name="guardianName")),
	@AttributeOverride(name= "guardianName", column=
	@Column(name="guardianEmail")),
	@AttributeOverride(name= "guardianMobile", column=
	@Column(name="guardianName"))
})


public class Guardian {
	private String guardianName;
	private String guardianEmail;
	private String guardianMobile;
	

}
