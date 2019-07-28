package com.pmrs.testservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pmrs.testdao.*;
import com.pmrs.pojos.Project;
import com.pmrs.pojos.Student;

//@Service
//@Transactional
public class StudentServiceImpl implements IStudentService{

	//@Autowired
	private IStudentDao studentDao;
	
	@Override
	public int registerStudent(Student student) {		
		return studentDao.registerStudent(student);
	}

	@Override
	public Student getStudentDetails(Student student) {
		return studentDao.getStudentDetails(student);
	}

	@Override
	public Student authenticateStudent(Student student) {		
		return studentDao.authenticateStudent(student);
	}

	@Override
	public int addProject(Project project) {
		return studentDao.addProject(project);
	}
	
}
