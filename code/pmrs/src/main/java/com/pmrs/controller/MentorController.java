package com.pmrs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmrs.iservice.IStudentService;

/**
 * 
 * @author ash
 * 
 * MentorController class defines functionalities like Viewing
 *
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping("/student")
public class MentorController {

	@Autowired
	private IStudentService studentService;
	
	
	
}
