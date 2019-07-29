package com.pmrs.pojos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * 
 * @author shash Course entity defines different departments(DAC,DITISS,IOT)
 *         when it is created and its status(active/inactive) one course can
 *         have multiple students
 *
 */

@SuppressWarnings("serial")
@Entity
@Table(name = "courses")
public class Course implements Serializable {

	@Id
	@Column(name = "c_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer courseId;

	@Column(name = "c_name", unique = true, length = 100)
	private String courseName;

	@Column(name = "c_added")
	private LocalDate added;

	@Enumerated(EnumType.STRING)
	private EEntityStatus courseStatus;

	
	// @JoinColumn(name = "student_id")
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "courses_students_map", joinColumns = { @JoinColumn(name = "studentId") }, inverseJoinColumns = {
			@JoinColumn(name = "courseId") })
	private List<Student> studentId = new ArrayList<Student>();

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "courseAdmins_courses_map", joinColumns = {
			@JoinColumn(name = "courseAdminId") }, inverseJoinColumns = { @JoinColumn(name = "courseId") })
	private List<CourseAdmin> courseAdminId = new ArrayList<CourseAdmin>();

	public Course() {

		System.out.println("Course Default Constuctor");
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public LocalDate getAdded() {
		return added;
	}

	public void setAdded(LocalDate added) {
		this.added = added;
	}

	public EEntityStatus getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(EEntityStatus courseStatus) {
		this.courseStatus = courseStatus;
	}

	public List<Student> getStudentId() {
		return studentId;
	}

	public void setStudentId(List<Student> studentId) {
		this.studentId = studentId;
	}

	public List<CourseAdmin> getCourseAdmin() {
		return courseAdminId;
	}

	public void setCourseAdmin(List<CourseAdmin> courseAdminId) {
		this.courseAdminId = courseAdminId;
	}

}
