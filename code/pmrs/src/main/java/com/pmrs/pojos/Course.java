package com.pmrs.pojos;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;



/**
 * 
 * @author shash Course entity defines different departments(DAC,DITISS,IOT)
 *         when it is created and its status(active/inactive) one course can
 *         have multiple students
 *
 */

@Entity
@Table(name = "courses")
public class Course {

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

	@OneToMany
	@JoinColumn(name = "student_id")
	private List<Student> studentId = new ArrayList<Student>();

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
		return StudentId;
	}

	public void setStudentId(List<Student> studentId) {
		StudentId = studentId;
	}

	// convenience methods

	public void addStudent(Student s) {
		studentId.add(s);// course --->student
		s.setStudentCourseId(this);// student --->course
	}

	public void removeStudent(Student s) {
		studentId.remove(s);// course -X--student
		s.setStudentCourseId(null);
	}

}
