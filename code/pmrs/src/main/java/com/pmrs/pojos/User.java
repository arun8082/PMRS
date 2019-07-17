package com.pmrs.pojos;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "u_id", nullable = false)
	private Integer userid;
	
	public Role getUser_role() {
		return user_role;
	}
	public void setUser_role(Role user_role) {
		this.user_role = user_role;
	}
	public void setUser_status(EntityStatus user_status) {
		this.user_status = user_status;
	}
	@Column(name = "u_name", nullable = false, length = 150)
	private String user_name;
	
	@Column(name = "u_email", nullable = false, length = 100)
	private String user_email;
	
	@Column(name = "u_contact", nullable = false, length = 12)
	private String user_contact;
	
	@Column(name = "u_password", nullable = false, length = 60)
	private String user_password;
	
	@Column(name = "u_role")
	@Enumerated(EnumType.STRING)
	private Role user_role;
	
	@Column(name = "u_status")
	@Enumerated(EnumType.STRING)
	private EntityStatus user_status;
	
	@Column(name = "u_created")
	private LocalDateTime user_created;
	
	@Column(name = "u_modified")
	private LocalDateTime user_modified;
	
	public User() {
	}
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_contact() {
		return user_contact;
	}
	public void setUser_contact(String user_contact) {
		this.user_contact = user_contact;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public LocalDateTime getUser_created() {
		return user_created;
	}
	public void setUser_created(LocalDateTime user_created) {
		this.user_created = user_created;
	}
	public LocalDateTime getUser_modified() {
		return user_modified;
	}
	public void setUser_modified(LocalDateTime user_modified) {
		this.user_modified = user_modified;
	}
}
