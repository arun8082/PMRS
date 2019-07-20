package com.pmrs.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * 
 * @author dac
 *mapping of students with Project groups
 */
@Entity
@Table(name = "group_students")
public class GroupStudent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "g_id", nullable = false)
    private Integer groupId;//g_id
	
	@OneToMany
	//@Column(name = "sid", nullable = false)
	//private int studentId;//sid
	@JoinColumn(name="student_id")
	private List<Student> studentId=new ArrayList<Student>();
	
	@Column(name = "role", nullable = false)
	private int studentRole;//role 0/1
		
	public Integer getGroupId() {
		return groupId;
	}


	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
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
