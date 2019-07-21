package com.pmrs.pojosold;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
/**
 * 
 * @author dac
 * mentor will update the projectstatus(hold,verified)
 *
 *
 */

//phaseStatus to projectStatus entity name change
//primary key column phaseStatusId ->projectstatusId
@Entity
@Table(name = "project_status")
public class ProjectStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ps_id", nullable = false)
	private Integer projectStatusId;// ps_id
	
	//owning
	
	//project id
	@OneToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name = "phasestatus_project")
	//private int projectId;//ps_pid
	private Project projectId;
	
	
	@ManyToOne
	//phase id
	//private int phaseId;//ps_phid
	private PhaseStatus phaseId;
	
	//status
	@Column(name = "ps_status", nullable = false)
	@Enumerated(EnumType.STRING)
	private EProjectStatus phaseStatus;//ps_status	
	
	public Integer getPhaseStatusId() {
		return projectStatusId;
	}

	public void setPhaseStatusId(Integer phaseStatusId) {
		this.projectStatusId = phaseStatusId;
	}
	
	public EProjectStatus getPhaseStatus() {
		return phaseStatus;
	}

	public void setPhaseStatus(EProjectStatus phaseStatus) {
		this.phaseStatus = phaseStatus;
	}

	public ProjectStatus()
	{
		System.out.println("In default phase status constructor");
	}
}