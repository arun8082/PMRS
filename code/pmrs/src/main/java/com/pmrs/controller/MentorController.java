package com.pmrs.controller;

import java.util.List;

/**
 * 
 * @author ash
 * 
 * MentorController class defines functionalities like Viewing
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmrs.iservice.IMentorService;
import com.pmrs.iservice.IProjectService;
import com.pmrs.iservice.IStudentService;
import com.pmrs.pojos.Mentor;
import com.pmrs.pojos.Project;
import com.pmrs.pojos.Student;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping("/pmrs/mentor")
public class MentorController {

	@Autowired
	private IStudentService studentService;
	@Autowired
	private IProjectService projectService;
	@Autowired
	private IMentorService mentorService;

	@PostMapping("/login")
	public Mentor authenticateMentor(@RequestBody Mentor mentor)
	{
		//System.out.println("In login student controller"+studentService.authenticateStudent(student));
		return mentorService.authenticateMentor(mentor);
	}
	
	@PostMapping("/studentList")
	public List<Student> getStudentList() {
		return studentService.listAll();
	}

	@PostMapping("/projectList")
	public List<Project> getprojectList(@RequestBody Mentor mentor) {
		//System.out.println(mentor);
		return projectService.listAll();
	}
}
