package com.pmrs.pojos;

import java.time.LocalDate;
import javax.persistence.*;

/**
 * 
 * @author ash This is Mentor POJO Class. It's properties are ID, First Name,
 *         Last Name, Course ID (Foreign Key), Email, Contact, Status
 *         (Active/Inactive), Date Added Along with getters and setters
 */

@Entity
@Table(name = "mentors")
public class Mentor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "m_id")
	private Integer mentorId;

	@Column(name = "m_first_name")
	private String mentorFirstName;

	@Column(name = "m_last_name")
	private String mentorLastName;

	// Many mentors are related to one course
	// @Column(name = "c_id")
	@ManyToOne
	private Course courseId;

	@Column(name = "m_email")
	private String mentorEmail;

	@Column(name = "m_contact")
	private String mentorContact;

	@Column(name = "m_password")
	private String mentorpassword;

	@Column(name = "m_status")
	@Enumerated(EnumType.STRING)
	private EEntityStatus mentorStatus;

	@Column(name = "m_added")
	private LocalDate mentorAdded;

	public Mentor() {
		System.out.println("This is mentor's constructor");
	}

	public Integer getMentorId() {
		return mentorId;
	}

	public void setMentorId(Integer mentorId) {
		this.mentorId = mentorId;
	}

	public String getMentorFirstName() {
		return mentorFirstName;
	}

	public void setMentorFirstName(String mentorFirstName) {
		this.mentorFirstName = mentorFirstName;
	}

	public String getMentorLastName() {
		return mentorLastName;
	}

	public void setMentorLastName(String mentorLastName) {
		this.mentorLastName = mentorLastName;
	}

	public Course getCourseId() {
		return courseId;
	}

	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}

	public String getMentorEmail() {
		return mentorEmail;
	}

	public void setMentorEmail(String mentorEmail) {
		this.mentorEmail = mentorEmail;
	}

	public String getMentorContact() {
		return mentorContact;
	}

	public void setMentorContact(String mentorContact) {
		this.mentorContact = mentorContact;
	}

	public String getMentorpassword() {
		return mentorpassword;
	}

	public void setMentorpassword(String mentorpassword) {
		this.mentorpassword = mentorpassword;
	}

	public EEntityStatus getMentorStatus() {
		return mentorStatus;
	}

	public void setMentorStatus(EEntityStatus mentorStatus) {
		this.mentorStatus = mentorStatus;
	}

	public LocalDate getMentorAdded() {
		return mentorAdded;
	}

	public void setMentorAdded(LocalDate mentorAdded) {
		this.mentorAdded = mentorAdded;
	}

}
