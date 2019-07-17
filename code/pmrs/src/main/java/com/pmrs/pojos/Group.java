package com.pmrs.pojos;

import java.time.LocalDateTime;

import javax.persistence.*;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "groups")
public class Group {
	
	@Column(name = "g_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer groupId;//g_id;
	
	@Column(name ="g_leader_id" )
	private int groupLeaderId;//g_lid(leader);
	
	@Column(name = "g_created")
	private LocalDateTime groupCreated;//g_created;

	public Group() {
		super();
		System.out.println("default constr of Group table");
	}	
	
}
