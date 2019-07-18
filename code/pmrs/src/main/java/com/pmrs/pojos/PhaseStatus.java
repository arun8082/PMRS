package com.pmrs.pojos;

import java.util.ArrayList;
import java.util.List;

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
	@ManyToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name = "phasestatus_project")
	//private int projectId;//ps_pid
	private Project projectId;
	
	
	@OneToOne
	//phase id
	//private int phaseId;//ps_phid
	private ProjectPhase phaseId;
	
	//status
	@Column(name = "ps_status", nullable = false)
	private EProjectStatus phaseStatus;//ps_status	
	
	public Integer getPhaseStatusId() {
		return phaseStatusId;
	}

	public void setPhaseStatusId(Integer phaseStatusId) {
		this.phaseStatusId = phaseStatusId;
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