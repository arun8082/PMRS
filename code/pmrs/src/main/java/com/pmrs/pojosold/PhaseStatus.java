package com.pmrs.pojosold;

import java.time.LocalDateTime;
import javax.persistence.*;
/**
 * 
 * @author dac
 * this entity defines the name of the phase(SRS,Design,Coding,Deployment) at which project is
 * and when it is created.
 * 
 *
 */

//ProjectPhase changed to PhaseStatus
@Entity
@Table(name = "phases")
public class PhaseStatus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ph_id")
	private Integer phaseId;
	
	@Column(name = "ph_name", nullable = false, length = 100, unique = true)
	private String phaseName;
	
	@Column(name = "ph_created")
	private LocalDateTime phaseCreated;

	public PhaseStatus() {
		System.out.println("default constr of Project Phase table");
	}

	public Integer getPhaseId() {
		return phaseId;
	}

	public void setPhaseId(Integer phaseId) {
		this.phaseId = phaseId;
	}

	public String getPhaseName() {
		return phaseName;
	}

	public void setPhaseName(String phaseName) {
		this.phaseName = phaseName;
	}

	public LocalDateTime getPhaseCreated() {
		return phaseCreated;
	}

	public void setPhaseCreated(LocalDateTime phaseCreated) {
		this.phaseCreated = phaseCreated;
	}	
	
}
