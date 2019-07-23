package com.pmrs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmrs.dao.ICourseAdminDAO;
import com.pmrs.pojos.CourseAdmin;

@RestController
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*")
@RequestMapping("/pmrs")
public class LoginController {

	@Autowired
	private ICourseAdminDAO courseAdminDao;

	@GetMapping("/login")
	public String showlogin() {
		return "This is login";
	}
	
	@PostMapping("/login")
	public CourseAdmin showlogin(@RequestBody CourseAdmin courseAdmin) {
		return courseAdminDao.getCourseAdmin(courseAdmin);
	}
	
}
