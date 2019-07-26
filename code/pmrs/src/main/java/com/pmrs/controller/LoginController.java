package com.pmrs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmrs.pojos.Course;
import com.pmrs.pojos.CourseAdmin;
import com.pmrs.service.ICourseAdminService;
import com.pmrs.service.ICourseService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping("/pmrs")
public class LoginController {

	@Autowired
	private ICourseAdminService courseAdminService;

	@Autowired
	private ICourseService courseService;

	@GetMapping("/home")
	public String showLogin() {
		return "Hi this is login page";
	}

	@PostMapping("/CourseAdmin/get")
	public CourseAdmin getCourseAdmin(@RequestBody CourseAdmin courseAdmin) {
		courseAdmin.setCourseId(courseAdmin.getCourseId());
		System.out.println(courseAdmin);
		return courseAdminService.get(courseAdmin.getCourseAdminId());
	}

	@PostMapping("/CourseAdmin/add")
	public CourseAdmin addCourseAdmin(@RequestBody CourseAdmin courseAdmin) {
		System.out.println(courseAdmin);
		return courseAdminService.add(courseAdmin);
	}

	@PostMapping("/CourseAdmin/update")
	public boolean updateCourseAdmin(@RequestBody CourseAdmin courseAdmin) {
		System.out.println(courseAdmin);
		courseAdminService.update(courseAdmin);
		return true;
	}

	@PostMapping("/CourseAdmin/list")
	public List<CourseAdmin> listAllCourseAdmin() {
		return courseAdminService.listAll();
	}

	@PostMapping("/CourseAdmin/remove")
	public boolean removeCourseAdmin(@RequestBody CourseAdmin courseAdmin) {
		return courseAdminService.remove(courseAdmin.getCourseAdminId());
	}

	@PostMapping("/Course/add")
	public Course addCourse(@RequestBody Course course) {
		return courseService.add(course);
	}
}
