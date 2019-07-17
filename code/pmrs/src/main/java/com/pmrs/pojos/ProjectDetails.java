package com.pmrs.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ProjectDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "p_id", nullable = false)
	private Integer project_id;
	
	@Column(name = "p_title", nullable = false ,length =256)
    private String  project_title;
	
	@Column(name="p_desc",nullable = false , length=256)
	private String  project_desc;
	
	@Column(name="p_hwreq",nullable = false , length=256)
	private String  project_hwrequire;
	
	@Column(name="p_swreq",nullable = false , length=256)
	private String project_swrequire;
	
	@Column(name="p_platform",nullable = false , length=256)
    private String project_platform;
	
	private Integer mentor_id; //users foreign key
	private Integer group_id; // groups foreign key
	private LocalDate project_created;
	private LocalDate project_duration;
	public Integer getProject_id() {
		return project_id;
	}
	public void setProject_id(Integer project_id) {
		this.project_id = project_id;
	}
	public String getProject_title() {
		return project_title;
	}
	public void setProject_title(String project_title) {
		this.project_title = project_title;
	}
	public String getProject_desc() {
		return project_desc;
	}
	public void setProject_desc(String project_desc) {
		this.project_desc = project_desc;
	}
	public String getProject_hwrequire() {
		return project_hwrequire;
	}
	public void setProject_hwrequire(String project_hwrequire) {
		this.project_hwrequire = project_hwrequire;
	}
	public String getProject_swrequire() {
		return project_swrequire;
	}
	public void setProject_swrequire(String project_swrequire) {
		this.project_swrequire = project_swrequire;
	}
	public String getProject_platform() {
		return project_platform;
	}
	public void setProject_platform(String project_platform) {
		this.project_platform = project_platform;
	}
	public Integer getMentor_id() {
		return mentor_id;
	}
	public void setMentor_id(Integer mentor_id) {
		this.mentor_id = mentor_id;
	}
	public Integer getGroup_id() {
		return group_id;
	}
	public void setGroup_id(Integer group_id) {
		this.group_id = group_id;
	}
	public LocalDate getProject_created() {
		return project_created;
	}
	public void setProject_created(LocalDate project_created) {
		this.project_created = project_created;
	}
	public LocalDate getProject_duration() {
		return project_duration;
	}
	public void setProject_duration(LocalDate project_duration) {
		this.project_duration = project_duration;
	}
	
	
	
	
	

}
