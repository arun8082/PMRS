package com.pmrs.pojos;

import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.List;


import javax.persistence.*;

/**
 * 
 * @author dac
 * Department entity defines different departments(DAC,DITISS,IOT)
 * when it is created and its status(active/inactive)
 * one department can have multiple students
 *
 */

@Entity
@Table(name = "departments")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "d_id", nullable = false)
	private Integer departmentId;

	@Column(name = "d_name", unique = true, length = 150, nullable = false)
	private String departmentName;

	@Column(name = "d_created")
	private LocalDateTime departmentCreated;

	@Column(name = "d_status")
	private EEntityStatus departmentStatus;
	
	@OneToMany
	@JoinColumn(name = "student_dept_id")
	private List<Student> studentId=new ArrayList<Student>();

	// Default CTOR
	public Department() {
		System.out.println("In Department Pojo CTOR");
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentCreated=" + departmentCreated + ", departmentStatus=" + departmentStatus + "]";
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public LocalDateTime getDepartmentCreated() {
		return departmentCreated;
	}

	public void setDepartmentCreated(LocalDateTime departmentCreated) {
		this.departmentCreated = departmentCreated;
	}

	public EEntityStatus getDepartmentStatus() {
		return departmentStatus;
	}

	public void setDepartmentStatus(EEntityStatus departmentStatus) {
		this.departmentStatus = departmentStatus;
	}
	
	//convenience methods
	
	public void addStudent(Student s)
	{
		studentId.add(s);//department --->student
		s.setStudentDepartmentid(this);//student --->department
	}
	public void removeStudent(Student s)
	{
		studentId.remove(s);//department -X--student
		s.setStudentDepartmentid(null);
	}


}
