package com.pmrs.pojos;

import javax.persistence.*;


@Entity
@Table(name = "phase_status")
public class PhaseStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ps_id", nullable = false)
	private Integer phaseStatusId;// ps_id
	
	//owning
	
	//project id
	@ManyToOne
	@JoinColumn(name = "phasestatus_project")
	private int projectId;//ps_pid
	
	//phase id
	private int phaseId;//ps_phid

	//status
	@Column(name = "ps_status", nullable = false)
	private EProjectStatus phaseStatus;//ps_status	
	
	public Integer getPhaseStatusId() {
		return phaseStatusId;
	}

	public void setPhaseStatusId(Integer phaseStatusId) {
		this.phaseStatusId = phaseStatusId;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getPhaseId() {
		return phaseId;
	}

	public void setPhaseId(int phaseId) {
		this.phaseId = phaseId;
	}
	
	public EProjectStatus getPhaseStatus() {
		return phaseStatus;
	}

	public void setPhaseStatus(EProjectStatus phaseStatus) {
		this.phaseStatus = phaseStatus;
	}

	public PhaseStatus()
	{
		System.out.println("In default phase status constructor");
	}
}