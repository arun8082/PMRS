
package com.pmrs.pojos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * Project entity defining Project Details. * @author Shipra
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "projects")
public class Project implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "p_id")
	private Integer projectId;

	@Column(name = "p_title", nullable = false,unique = true)
	private String projectTitle;

	@Column(name = "p_description", nullable = false)
	private String projectDescription;

	@Column(name = "p_technology", nullable = false)
	private String projectTechnology;

	@Column(name = "p_hwrequirement", nullable = false)
	private String projectHWRequire;

	@Column(name = "p_swrequirement", nullable = false)
	private String projectSWRequire;

	@Column(name = "p_platform", nullable = false)
	private String projectPlatform;

	// owning -- Foreign Key
	
	@JsonBackReference // added this annotation to prevent recursive de-serialization of properties 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "p_mentor")
	private Mentor mentorId;

	@Column(name = "p_created")
	private LocalDate projectCreated;

	@Column(name = "p_duration")
	private LocalDate projectDuration;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "s_id")
	private List<Student> studentId = new ArrayList<>();

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_projectphaseId")
	private List<ProjectPhase> projectphaseId = new ArrayList<ProjectPhase>();

	// convenience method to add join table(Project phases)
	public void addProjectPhases(ProjectPhase ph) {
		this.projectphaseId.add(ph);
	}

	// Convenience Method
	public void addStudent(Student s) {
		studentId.add(s); // Project --->Student
		s.setStudentProjectId(this); // Student --->Project
	}

	public void removeStudent(Student s) {
		studentId.remove(s); // Project -X--Student
		s.setStudentProjectId(null);
	}

	// Default CTOR
	public Project() {
		super();
		System.out.println("Default CTOR of Projects POJO");
	}

	// Getters and Setters
	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getProjectTechnology() {
		return projectTechnology;
	}

	public void setProjectTechnology(String projectTechnology) {
		this.projectTechnology = projectTechnology;
	}

	public String getProjectHWRequire() {
		return projectHWRequire;
	}

	public void setProjectHWRequire(String projectHWRequire) {
		this.projectHWRequire = projectHWRequire;
	}

	public String getProjectSWRequire() {
		return projectSWRequire;
	}

	public void setProjectSWRequire(String projectSWRequire) {
		this.projectSWRequire = projectSWRequire;
	}

	public String getProjectPlatform() {
		return projectPlatform;
	}

	public void setProjectPlatform(String projectPlatform) {
		this.projectPlatform = projectPlatform;
	}

	public Mentor getMentorId() {
		return mentorId;
	}

	public void setMentorId(Mentor mentorId) {
		this.mentorId = mentorId;
	}

	public LocalDate getProjectCreated() {
		return projectCreated;
	}

	public void setProjectCreated(LocalDate projectCreated) {
		this.projectCreated = projectCreated;
	}

	public LocalDate getProjectDuration() {
		return projectDuration;
	}

	public void setProjectDuration(LocalDate projectDuration) {
		this.projectDuration = projectDuration;
	}

	public List<Student> getStudentId() {
		return studentId;
	}

	public void setStudentId(List<Student> studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectTitle=" + projectTitle + ", projectDescription="
				+ projectDescription + ", projectTechnology=" + projectTechnology + ", projectHWRequire="
				+ projectHWRequire + ", projectSWRequire=" + projectSWRequire + ", projectPlatform=" + projectPlatform
				+ ", mentorId=" + mentorId + ", projectCreated=" + projectCreated + ", projectDuration="
				+ projectDuration + ", studentId=" + studentId + ", projectphaseId=" + projectphaseId + "]";
	}

}
