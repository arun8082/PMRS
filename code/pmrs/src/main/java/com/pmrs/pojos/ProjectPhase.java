package com.pmrs.pojos;

import java.time.LocalDateTime;
import javax.persistence.*;

public class ProjectPhase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ph_id")
	private int phaseId;
	
	@Column(name = "ph_name", nullable = false, length = 100, unique = true)
	private String phaseName;
	
	@Column(name = "ph_created")
	private LocalDateTime phaseCreated;

	public ProjectPhase() {
		
	}
	
	public int getPhaseId() {
		return phaseId;
	}

	public void setPhaseId(int phaseId) {
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
