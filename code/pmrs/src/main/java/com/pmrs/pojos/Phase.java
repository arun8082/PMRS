package com.pmrs.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * This pojo contins project pahse names and status(active/inactive)
 * i.e. current phase is enabled to use or not 
 * 
 * @author arun
 *
 */

@Entity
@Table(name = "pahses")
public class Phase {

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
	
	//added join table list-project phases //raman
	@OneToMany(mappedBy = "Phase")
	private List<ProjectPhases> projectphase=new ArrayList<ProjectPhases>();
	
	
	
	
	public Phase() {
		super();
		System.out.println("Def constr of Pahse pojo");
	}
	
	//convenience method to add join table(Project phases)
	public void addProjectPhases(ProjectPhases ph)
	{
		this.projectphase.add(ph);
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
