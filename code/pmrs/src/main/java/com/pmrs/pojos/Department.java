package com.pmrs.pojos;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer departmentId;
	
	@Column(name="d_name", unique=true)
	private String departmentName;
	
	@Column(name="d_created")
	private LocalDateTime departmentCreated;
	
	@Column(name="d_status")
	private Status departmentStatus;
}
