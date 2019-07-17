package com.pmrs.pojos;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer departmentId;
	
	@Column(name="d_name", unique=true, length=150)
	private String departmentName;
	
	@Column(name="d_created")
	private LocalDateTime departmentCreated;
	
	@Column(name="d_status")
	private EntityStatus departmentStatus;

	//Default CTOR
	public Department() {
		System.out.println("In Department Pojo CTOR");
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentCreated=" + departmentCreated + ", departmentStatus=" + departmentStatus + "]";
	}

}
