package com.pmrs.pojos;

import java.time.LocalDateTime;
import javax.persistence.*;
/**
 * 
 * @author dac
 *defines the type of user(mentor,admin,groupleader)
 *
 *
 */



@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "u_id", nullable = false)
	private Integer userId;

	@Column(name = "u_name", nullable = false, length = 150)
	private String userName;

	@Column(name = "u_email", nullable = false, length = 100)
	private String userEmail;

	@Column(name = "u_contact", nullable = false, length = 12)
	private String userContact;

	@Column(name = "u_password", nullable = false, length = 60)
	private String userPassword;

	@Column(name = "u_role")
	@Enumerated(EnumType.STRING)
	private ERole userRole;

	@Column(name = "u_status")
	@Enumerated(EnumType.STRING)
	private EEntityStatus userStatus;

	@Column(name = "u_created")
	private LocalDateTime userCreated;

	@Column(name = "u_modified")
	private LocalDateTime userModified;

	public User() {
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserContact() {
		return userContact;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public ERole getUserRole() {
		return userRole;
	}

	public void setUserRole(ERole userRole) {
		this.userRole = userRole;
	}

	public EEntityStatus getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(EEntityStatus userStatus) {
		this.userStatus = userStatus;
	}

	public LocalDateTime getUserCreated() {
		return userCreated;
	}

	public void setUserCreated(LocalDateTime userCreated) {
		this.userCreated = userCreated;
	}

	public LocalDateTime getUserModified() {
		return userModified;
	}

	public void setUserModified(LocalDateTime userModified) {
		this.userModified = userModified;
	}

}
