/**
 * 
 * @author Shipra
 *Student details
 */

package com.pmrs.pojos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "students")
public class Student implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "s_id")
	private Integer studentId;

	@Column(name = "s_prn", unique = true)
	private String prn;

	@Column(name = "s_first_name", nullable = false, length = 150)
	private String studentFirstName;

	@Column(name = "s_last_name", nullable = false, length = 150)
	private String studentLastName;

	@Column(name = "s_email", nullable = false, length = 100, unique = true)
	private String studentEmail;

	@Column(name = "s_contact", nullable = false, length = 12)
	private String studentContact;

	@Column(name = "s_password")
	private String studentpassword;

	@Column(name = "s_status", nullable = false)
	@Enumerated(EnumType.STRING)
	private EEntityStatus studentStatus;

	@ManyToOne
	@JoinColumn(name = "s_projectid")
	private Project studentProjectId;

	// @JoinColumn(name = "s_courseid")
	@ManyToMany
	@JoinTable(name = "courses_students_map", joinColumns = { @JoinColumn(name = "courseId") }, inverseJoinColumns = {
			@JoinColumn(name = "studentId") })
	private List<Course> studentCourseID = new ArrayList<Course>();

	@Column(name = "s_added")
	private LocalDate added;

	public Student() {
		super();
		System.out.println("Default constr of Student");
	}

	public Student(int studentId) {
		this.studentId=studentId;
	}

	// Getters and Setters
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

	public String getStudentpassword() {
		return studentpassword;
	}

	public void setStudentpassword(String studentpassword) {
		this.studentpassword = studentpassword;
	}

	public EEntityStatus getStudentStatus() {
		return studentStatus;
	}

	public void setStudentStatus(EEntityStatus studentStatus) {
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

	public List<Course> getStudentCourseID() {
		return studentCourseID;
	}

	public void setStudentCourseID(List<Course> studentCourseID) {
		this.studentCourseID = studentCourseID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentId == null) ? 0 : studentId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (studentId == null) {
			if (other.studentId != null)
				return false;
		} else if (!studentId.equals(other.studentId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", prn=" + prn + ", studentFirstName=" + studentFirstName
				+ ", studentLastName=" + studentLastName + ", studentEmail=" + studentEmail + ", studentContact="
				+ studentContact + ", studentpassword=" + studentpassword + ", studentStatus=" + studentStatus
				+ ", studentProjectId=" + studentProjectId + ", studentCourseID=" + studentCourseID + ", added=" + added
				+ "]";
	}

	
}
