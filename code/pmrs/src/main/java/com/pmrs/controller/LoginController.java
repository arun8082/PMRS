package com.pmrs.controller;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.pmrs.dao.ICourseAdminDAO;
import com.pmrs.dao.ICourseDAO;
import com.pmrs.dao.IStudentDAO;
import com.pmrs.pojos.Course;
import com.pmrs.pojos.CourseAdmin;
import com.pmrs.pojos.FileUpload;
import com.pmrs.pojos.Student;

@RestController
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*")
@RequestMapping("/pmrs")
public class LoginController {

	@Autowired
	private ICourseAdminDAO courseAdminDAO;
	@Autowired
	private ICourseDAO courseDAO;
	//@Autowired
	//private IStudentDAO studentDao;
	
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
	/*
	@PostMapping("/upload")
	public int uploadDocument(@RequestParam MultipartFile file) {
		System.out.println("register student");	
		String uploadLocation = "F:\\b1_project\\PMRS\\code\\pmrs\\target\\documents";
		System.out.println(file.getOriginalFilename()+" ");
		File dest=new File(uploadLocation, file.getOriginalFilename());
		//file transferred to server side folder 
		try {
			file.transferTo(dest);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 1;
	}*/
	@PostMapping("/upload")
	public int uploadDocument(@RequestParam MultipartFile file,Student student) {
		System.out.println("register student"+student);	
		String uploadLocation = "F:\\b1_project\\PMRS\\code\\pmrs\\target\\documents";
		System.out.println(file.getOriginalFilename());
		File dest=new File(uploadLocation, file.getOriginalFilename());
		//file transferred to server side folder 
		try {
			file.transferTo(dest);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 1;
	}
	
	@PostMapping("/register/student")
	public Student registerStudent(@RequestParam Student student) {
		System.out.println("register student "+student);	
		//Student s=studentDao.add(student);
		//System.out.println(s);	
		return null;
	}
	
}
