package com.pmrs.pojos;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * This POJO contains project phase names and status(active/inactive) i.e.
 * current phase is enabled to use or not project phases like
 * REQUIREMENT,DOCUMENTATION,DESIGN,CODING,TESTING,IMPLEMENTATION
 * 
 * @author arun
 *
 */

@SuppressWarnings("serial")
@Entity
@Table(name = "phases")
public class Phase implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ph_id")
	private Integer phaseId;

	@Column(name = "ph_name")
	private String phaseName;

	@Column(name = "ph_status")
	@Enumerated(EnumType.STRING)
	private EEntityStatus status;

	@Column(name = "ph_added")
	private LocalDate added;

	public Phase() {
		super();
		System.out.println("Def constr of Pahse pojo");
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

	public EEntityStatus getStatus() {
		return status;
	}

	public void setStatus(EEntityStatus status) {
		this.status = status;
	}

	public LocalDate getAdded() {
		return added;
	}

	public void setAdded(LocalDate added) {
		this.added = added;
	}

}
