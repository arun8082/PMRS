package com.pmrs.pojos;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;

/**
 * In this POJO we are managing projects(w.r.t. projectId) phases status e.g
 * Student uploaded a document(let SRS) and this project will be in onHold state
 * till mentor not verify that document.
 * 
 * @author Raman Chopra
 *
 */

@SuppressWarnings("serial")
@Entity
@Table(name = "project_phases")
public class ProjectPhase implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pph_id", nullable = false)
	private Integer projectPhaseId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "projectId")
	private Project projectId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "phaseId")
	private Phase phaseId;

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
