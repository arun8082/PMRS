package com.pmrs.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pmrs.iservice.IProjectService;
import com.pmrs.iservice.IStudentService;
import com.pmrs.pojos.EEntityStatus;
import com.pmrs.pojos.Project;
import com.pmrs.pojos.Student;

/**
 * 
 * @author Raman Chopra
 *
 */

@RestController
@RequestMapping("/pmrs/student")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class StudentController {

	@Autowired
	public IStudentService studentService;

	@Autowired
	public IProjectService projectService;

	public StudentController() {
	}

	/**
	 * 
	 * Method to authenticate student
	 */
	@PostMapping("/login")
	public Student authenticateStudent(@RequestBody Student student) {
		return studentService.authenticateStudent(student);
	}

	/**
	 * 
	 * Method to register the student
	 */
	@PostMapping("/register")
	public Student registerStudent(@RequestBody Student student) {
		student.setAdded(LocalDate.now());
		student.setStatus(EEntityStatus.INACTIVE);
		return studentService.add(student);
	}

	/**
	 * 
	 * Method to add the project
	 */
	@PostMapping("/addProject")
	public Project addProject(@RequestBody Project project) {
		project.setProjectCreated(LocalDate.now());
		return projectService.add(project);

	}

	/**
	 * 
	 * Method to get list of members in particular projects using project id
	 */
	@PostMapping("/memberlist")
	public List<Student> getMemberList(@RequestBody Project projectId) {
		return studentService.listAll(projectId);
	}

}
