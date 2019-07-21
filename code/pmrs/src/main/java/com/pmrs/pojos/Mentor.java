package com.pmrs.pojos;

import java.time.LocalDate;
import javax.persistence.*;

/**
 * 
 * @author ashu
 * 		   This is Mentor POJO Class. It's properties are ID, First Name,
 *         Last Name, Course ID (Foreign Key), Email, Contact, Status
 *         (Active/Inactive), Date Added Along with getters and setters
 */

@Entity
@Table(name = "mentors")
public class Mentor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "m_id")
	private Integer id;

	@Column(name = "m_first_name")
	private String firstName;

	@Column(name = "m_last_name")
	private String lastName;

	// Many mentors are related to one course
	@Column(name = "c_id")
	@ManyToOne
	private Course courseId;

	@Column(name = "email")
	private String email;

	@Column(name = "contact")
	private String contact;

	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private EEntityStatus status;

	@Column(name = "added")
	private LocalDate added;

	public Mentor() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public LocalDate getAdded() {
		return added;
	}

	public void setAdded(LocalDate added) {
		this.added = added;
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

	public EEntityStatus getStatus() {
		return status;
	}

	public void setStatus(EEntityStatus status) {
		this.status = status;
	}

	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}

}
