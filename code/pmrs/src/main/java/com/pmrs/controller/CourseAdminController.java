package com.pmrs.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pmrs.iservice.ICourseAdminService;
import com.pmrs.iservice.ICourseService;
import com.pmrs.iservice.IMentorService;
import com.pmrs.iservice.IProjectService;
import com.pmrs.iservice.IStudentService;
import com.pmrs.pojos.Course;
import com.pmrs.pojos.CourseAdmin;
import com.pmrs.pojos.Mentor;
import com.pmrs.pojos.Project;
import com.pmrs.pojos.Student;
/**
 * 
 * This controller is responsible for admin related services like insert update delete
 * @author Arun
 *
 */

@RestController
@RequestMapping("/pmrs/admin")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CourseAdminController {

	@Autowired
	private ICourseAdminService courseAdminService;
	@Autowired
	private IStudentService studentService;
	@Autowired
	private IMentorService mentorService;
	@Autowired
	private ICourseService courseService;
	@Autowired
	private IProjectService projectService;

	public CourseAdminController() {
		System.out.println("Admin controller ");
	}

	@PostMapping("/login")
	public CourseAdmin authenticateCourseAdmin(@RequestBody CourseAdmin admin) {
		//System.out.println("controller "+admin);
		return courseAdminService.authenticate(admin);
	}

	@PostMapping("/registerMentor")
	public Mentor registerMentor(@RequestBody Mentor mentor) {
		mentor.setAdded(LocalDate.now());
		return mentorService.add(mentor);
	}

	@PostMapping("/registerStudent")
	public Student registerStudent(@RequestBody Student student) {
		student.setAdded(LocalDate.now());
		return studentService.add(student);
	}

	@PostMapping("/registerCourse")
	public Course registerCourseAdmin(@RequestBody Course course) {
		course.setAdded(LocalDate.now());
		return courseService.add(course);
	}

	@PostMapping("/get")
	public CourseAdmin getCourseAdminDetails(@RequestBody CourseAdmin admin) {
		return courseAdminService.get(admin.getCourseAdminId());
	}

	/**
	 * Retrieve all students list without any condition
	 */
	@GetMapping("/studentList")
	public List<Student> getAllStudentList() {
		return studentService.listAll();
	}

	/**
	 * Retrieve all students list with conditions
	 * mentorId
	 */
	public List<Student> getAllStudentList(int men) {
		return studentService.listAll();
	}

	/**
	 * Retrieve all the mentors list with out any conditions
	 */
	@GetMapping("/mentorList")
	public List<Mentor> getAllMentorList() {
		return mentorService.listAll();
	}

	/**
	 * Retrieve all the mentors list with conditions CourseId AdminId
	 */
	public List<Mentor> getAllMentorList(int courseId) {
		return null;
	}

	/**
	 * Retrieve all projects list with out any conditions
	 */
	@GetMapping("/projectList")
	public List<Project> getAllProjectList() {
		return projectService.listAll();
	}

	/**
	 * Retrieve all projects list with conditions CourseId MentorId
	 */
	public List<Project> getAllProjectList(int courseId) {
		return null;
	}

	/**
	 * Get generated report students report(csv) with condition CourseId
	 */
	public void/* Check csv return type */ getProjectReport(int courseId) {

	}
}
