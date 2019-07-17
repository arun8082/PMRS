package com.pmrs.pojos;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "s_id",nullable = false)
	private Integer studentId;
    
	@Column(name = "s_name", nullable = false,length=150)
	private String studentName;

	@Column(name = "s_email",nullable = false,length=100,unique = true)
	private String studentEmail;
	
	@Column(name = "s_contact", nullable = false,length=12)
	private String studentContact;
	
	@Column(name = "s_deptid")
	private Integer studentDepartmentid;
	
	@Column(name = "s_created")
	private LocalDateTime studentCreated;
	
	public Student() {
		super();
		System.out.println("Default constr of Student");
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentContact() {
		return studentContact;
	}

	public void setStudentContact(String studentContact) {
		this.studentContact = studentContact;
	}

	public Integer getStudentDepartmentid() {
		return studentDepartmentid;
	}

	public void setStudentDepartmentid(Integer studentDepartmentid) {
		this.studentDepartmentid = studentDepartmentid;
	}

	public LocalDateTime getStudentCreated() {
		return studentCreated;
	}

	public void setStudentCreated(LocalDateTime studentCreated) {
		this.studentCreated = studentCreated;
	}
	
	
}

