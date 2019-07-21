package com.pmrs.pojos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.oldpmrs.EPhaseStatus;
/**
 * In this pojos we are managing projects(w.r.t. projectId) phases status
 * e.g Student uploaded a document(let srs) and this project wil be in onHold state 
 * till mentor not verify that document.
 * @author Raman Chopra
 *
 */

@Entity
@Table(name = "project_phases")
public class ProjectPhase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pph_id", nullable = false)
	private Integer projectPhaseId;
	
	@ManyToOne
	@JoinColumn(name = "projectId")
	private Project projectId;
	
	@ManyToOne
	@JoinColumn(name = "phaseId")
	private Phase phaseId;
	
	@Column(name = "pph_status", nullable = false)
	@Enumerated(EnumType.STRING)
	private EEntityStatus status;
	
	@Column(name = "pph_start")
	private LocalDateTime startDate;
	
	@Column(name = "pph_end")
	private LocalDateTime endDate;	

	@Column(name = "pph_document_path")
	private String documentPath;
	
	public ProjectPhase() {
		super();
		System.out.println("def contr of Project phase");
	}

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

	public EEntityStatus getStatus() {
		return status;
	}

	public void setStatus(EEntityStatus status) {
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
	
	
}
