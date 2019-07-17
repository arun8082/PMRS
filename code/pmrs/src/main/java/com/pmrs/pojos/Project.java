package com.pmrs.pojos;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projects")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "p_id", nullable = false)
	private Integer projectId;
	
	@Column(name = "p_title", nullable = false )
    private String  projectTitle;
	
	@Column(name="p_desc",nullable = false)
	private String  projectDescription;
	
	@Column(name="p_hwreq",nullable = false)
	private String  projectHWRequire;
	
	@Column(name="p_swreq",nullable = false)
	private String projectSWRequire;
	
	@Column(name="p_platform",nullable = false)
    private String projectPlatform;
	
	private int mentorId; //users foreign key
	private int groupId; // groups foreign key
	
	@Column(name="p_created")
	private LocalDateTime projectCreated;
	
	@Column(name="p_duration")
	private LocalDateTime projectDuration;

	public Project() {
		super();
		System.out.println("default constr of Projects table");
	}

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

	public int getMentorId() {
		return mentorId;
	}

	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public LocalDateTime getProjectCreated() {
		return projectCreated;
	}

	public void setProjectCreated(LocalDateTime projectCreated) {
		this.projectCreated = projectCreated;
	}

	public LocalDateTime getProjectDuration() {
		return projectDuration;
	}

	public void setProjectDuration(LocalDateTime projectDuration) {
		this.projectDuration = projectDuration;
	}
	
	
}
