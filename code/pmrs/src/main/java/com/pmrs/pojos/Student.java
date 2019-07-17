package com.pmrs.pojos;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "s_id", updatable = false, nullable = false,length=11)
	private Integer studentId;
    
	@Column(name = "s_name", updatable = true, nullable = false,length=150)
	private String studentName;

	@Column(name = "s_email", updatable = true, nullable = false,length=100,unique = true)
	private String studentEmail;
	
	@Column(name = "s_contact", updatable = false, nullable = false,length=12)
	private String studentContact;
	
	@Column(name = "s_Did")
	private Integer studentDid;
	
	@Column(name = "s_created")
	private LocalDateTime studentCreated;
	
	
}

