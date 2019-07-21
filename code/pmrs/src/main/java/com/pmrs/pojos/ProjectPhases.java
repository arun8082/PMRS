package com.pmrs.pojos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
/**
 * 
 * @author Raman Chopra
 *
 */



@Entity
@Table(name = "project_phases")
public class ProjectPhases {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "p_ph_id", nullable = false)
	private Integer projectPhaseId;
	
	@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="project_id")
	private Project projectId;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="phase_id")
	private Phase phaseId;
	
	
	@Column(name = "p_ph_status", nullable = false)
	@Enumerated(EnumType.STRING)
	private EPhaseStatus status;
	
	@Column(name = "p_ph_start")
	private LocalDateTime startDate;
	
	@Column(name = "p_ph_end")
	private LocalDateTime endDate;
	

	@Column(name = "document_path")
	private String documentPath;
	
	
	public Integer getProjectPhaseId() {
		return projectPhaseId;
	}

	public void setProjectPhaseId(Integer projectPhaseId) {
		this.projectPhaseId = projectPhaseId;
	}

	public Project getProjectId() {
		return projectId;
	}

	public void setProjectId(Project projectId) {
		this.projectId = projectId;
	}

	public Phase getPhaseId() {
		return phaseId;
	}

	public void setPhaseId(Phase phaseId) {
		this.phaseId = phaseId;
	}

	

	public EPhaseStatus getStatus() {
		return status;
	}

	public void setStatus(EPhaseStatus status) {
		this.status = status;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public String getDocumentPath() {
		return documentPath;
	}

	public void setDocumentPath(String documentPath) {
		this.documentPath = documentPath;
	}

	
	public ProjectPhases()
	{
		System.out.println("In project phases default constructor");
	}
	
	
	
	

}
