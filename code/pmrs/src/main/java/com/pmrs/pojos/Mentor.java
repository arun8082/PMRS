package com.pmrs.pojos;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * 
 * @author ash This is Mentor POJO Class. It's properties are ID, First Name,
 *         Last Name, Course ID (Foreign Key), Email, Contact, Status
 *         (Active/Inactive), Date Added Along with getters and setters
 */

@SuppressWarnings("serial")
@Entity
@Table(name = "mentors")
public class Mentor implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "m_id")
	private Integer mentorId;

	@Column(name = "m_first_name")
	private String firstName;

	@Column(name = "m_last_name")
	private String lastName;

	// Many mentors are related to one course
	// @Column(name = "c_id")
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	private Course courseId;

	@Column(name = "m_email")
	private String email;

	@Column(name = "m_contact")
	private String contact;

	@Column(name = "m_password")
	private String password;

	@Column(name = "m_status")
	@Enumerated(EnumType.STRING)
	private EEntityStatus status;

	@Column(name = "m_added")
	private LocalDate added;

	public Mentor() {
		System.out.println("This is mentor's constructor");
	}

	public Integer getMentorId() {
		return mentorId;
	}

	public void setMentorId(Integer mentorId) {
		this.mentorId = mentorId;
	}	

	public Course getCourseId() {
		return courseId;
	}

	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getContact() {
		return contact;
	}

	public String getPassword() {
		return password;
	}

	public EEntityStatus getStatus() {
		return status;
	}

	public LocalDate getAdded() {
		return added;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String LastName) {
		this.lastName = LastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setStatus(EEntityStatus status) {
		this.status = status;
	}

	public void setAdded(LocalDate added) {
		this.added = added;
	}

	@Override
	public String toString() {
		return "Mentor [mentorId=" + mentorId + ", firstName=" + firstName + ", lastName=" + lastName + ", courseId="
				+ courseId + ", email=" + email + ", contact=" + contact + ", password=" + password + ", status="
				+ status + ", added=" + added + "]";
	}

	
	
}
