package com.pmrs.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "group_students")
public class GroupStudent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "g_id", nullable = false)
    private Integer groupId;//g_id
	
	@Column(name = "sid", nullable = false)
	private int studentId;//sid
	
	@Column(name = "role", nullable = false)
	private int studentRole;//role
	
	
	public Integer getGroupId() {
		return groupId;
	}


	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public int getStudentRole() {
		return studentRole;
	}


	public void setStudentRole(int studentRole) {
		this.studentRole = studentRole;
	}


	public GroupStudent()
	{
		System.out.println("In groupStudent defualt constructor");
	}
	
}
