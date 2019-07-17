package com.pmrs.pojos;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "u_id", nullable = false)
	private Integer userid;
	
	@Column(name = "u_name", nullable = false, length = 150)
	private String user_name;
	
	@Column(name = "u_email", nullable = false, length = 100)
	private String user_email;
	
	@Column(name = "u_contact", nullable = false, length = 12)
	private String user_contact;
	
	@Column(name = "u_password", nullable = false, length = 60)
	private String user_password;
	
	@Column(name = "u_role")
	private String user_role;
	private String user_status;
	private LocalDate user_created;
	private LocalDate user_modified;
	
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
	public String getUser_role() {
		return user_role;
	}
	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	public String getUser_status() {
		return user_status;
	}
	public void setUser_status(String user_status) {
		this.user_status = user_status;
	}
	public LocalDate getUser_created() {
		return user_created;
	}
	public void setUser_created(LocalDate user_created) {
		this.user_created = user_created;
	}
	public LocalDate getUser_modified() {
		return user_modified;
	}
	public void setUser_modified(LocalDate user_modified) {
		this.user_modified = user_modified;
	}

}
