package com.pmrs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pmrs.dao.ICourseAdminDAO;
import com.pmrs.dao.ICourseDAO;
import com.pmrs.pojos.Course;
import com.pmrs.pojos.CourseAdmin;

@RestController
@RequestMapping("/pmrs")
public class LoginController {

	@Autowired
	private ICourseAdminDAO courseAdminDAO;
	@Autowired
	private ICourseDAO courseDAO;
	
	@GetMapping("/login")
	public String showLogin() {
		return "Hi this is login page";
	}
	
	@PostMapping("/login/courseAdmin")
	public CourseAdmin showLogin(@RequestBody CourseAdmin courseAdmin) {
		System.out.println(courseAdmin);
		courseAdmin.setCourseId(courseAdmin.getCourseId());
		return courseAdminDAO.add(courseAdmin);
	}
	@PostMapping("/login/course")
	public Course showLogin(@RequestBody Course course) {
		return courseDAO.add(course);
	}
}
