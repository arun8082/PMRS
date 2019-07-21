package com.pmrs.pojos;

import java.time.LocalDate;

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

	public Phase() {
		super();
		System.out.println("Def constr of Pahse pojo");
	}	
	
}
