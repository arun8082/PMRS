package com.pmrs.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Course admin is a super user who can access evething Course Admin can create
 * new course and manage the courses
 * 
 * Foreign Keys courseAdmin<-->Course(M:M)
 * 
 * @author Aurn
 *
 */

@Entity
@Table(name = "course_admins")
public class CourseAdmin {

	@Id
	@Column(name = "ca_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer courseAdminId;

	@Column(name = "ca_first_name")
	private String firstName;

	@Column(name = "ca_last_name")
	private String lastName;

	@Column(name = "ca_email")
	private String email;

	@Column(name = "ca_contact")
	private String contact;
	
	@Column(name="ca_password")
	private String  coursepassword;
	

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "courseAdmins_courses_map", joinColumns = {
			@JoinColumn(name = "courseId") }, inverseJoinColumns = { @JoinColumn(name = "courseAdminId") })
	private List<Course> courseId = new ArrayList<Course>();

	@Column(name = "ca_status")
	@Enumerated(EnumType.STRING)
	private EEntityStatus status;

	@Column(name = "ca_added")
	private LocalDate added;

	public CourseAdmin() {
		super();
		System.out.println("Def constr of Course Admin");
	}

	public Integer getCourseAdminId() {
		return courseAdminId;
	}

	public void setCourseAdminId(Integer courseAdminId) {
		this.courseAdminId = courseAdminId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public List<Course> getCourseId() {
		return courseId;
	}

	public String getCoursepassword() {
		return coursepassword;
	}

	public void setCoursepassword(String coursepassword) {
		this.coursepassword = coursepassword;
	}

	public void setCourseId(List<Course> courseId) {
		this.courseId = courseId;
	}

	public EEntityStatus getStatus() {
		return status;
	}

	public void setStatus(EEntityStatus status) {
		this.status = status;
	}

	public LocalDate getAdded() {
		return added;
	}

	public void setAdded(LocalDate added) {
		this.added = added;
	}

}
