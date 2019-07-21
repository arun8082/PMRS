/**
 * 
 * @author Shipra
 *Student details
 */

package com.pmrs.pojos;
import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "s_id")
	private Integer studentId;
	
	@Column(name = "s_prn",unique = true)
	private String prn;
    
	@Column(name = "s_name", nullable = false,length=150)
	private String studentFirstName;
	
	@Column(name = "s_name", nullable = false,length=150)
	private String studentLastName;

	@Column(name = "s_email",nullable = false,length=100,unique = true)
	private String studentEmail;
	
	@Column(name = "s_contact", nullable = false,length=12,unique = true)
	private String studentContact;
	
	@Column(name = "s_status", nullable = false)
	@Enumerated(EnumType.STRING)
	private String studentStatus;
	
	@ManyToOne
	@JoinColumn(name = "s_projectid")
	private Project studentProjectId;
	
	@ManyToOne
	@JoinColumn(name = "s_courseid")
	private Course studentCourseID;
	
	@Column(name = "s_added")
	private LocalDate added;
	
	public Student() {
		super();
		System.out.println("Default constr of Student");
	}

	//Getters and Setters
	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getPrn() {
		return prn;
	}

	public void setPrn(String prn) {
		this.prn = prn;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
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

	public String getStudentStatus() {
		return studentStatus;
	}

	public void setStudentStatus(String studentStatus) {
		this.studentStatus = studentStatus;
	}

	public Project getStudentProjectId() {
		return studentProjectId;
	}

	public void setStudentProjectId(Project studentProjectid) {
		this.studentProjectId = studentProjectid;
	}

	public LocalDate getAdded() {
		return added;
	}

	public void setAdded(LocalDate added) {
		this.added = added;
	}

	public Course getStudentCourseID() {
		return studentCourseID;
	}

	public void setStudentCourseID(Course studentCourseID) {
		this.studentCourseID = studentCourseID;
	}	
	
	
		
}

