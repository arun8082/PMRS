/**
 * 
 * @author dac
 *Student details
 */

package com.pmrs.pojos;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "s_id")
	private Integer studentId;
	
	@Column(name = "s_prn",unique = true)
	private String prn;
    
	@Column(name = "s_name", nullable = false,length=150)
	private String studentFirstName;
	
	@Column(name = "s_name", nullable = false,length=150)
	private String studentLastName;

	@Column(name = "s_email",nullable = false,length=100,unique = true)
	private String studentEmail;
	
	@Column(name = "s_contact", nullable = false,length=12,unique = true)
	private String studentContact;
	
	@Column(name = "s_status", nullable = false)
	@Enumerated(EnumType.STRING)
	private String studentStatus;
	
	@ManyToOne
	//@Column(name = "s_projectid")
	private Project studentProjectid;
	
	@Column(name = "s_added")
	private LocalDate added;
	
	public Student() {
		super();
		System.out.println("Default constr of Student");
	}
		
}

