package com.pmrs.testservices;

import com.pmrs.pojos.Project;
import com.pmrs.pojos.Student;

public interface IStudentService {
	public int registerStudent(Student student);
	public Student getStudentDetails(Student student);
	public Student authenticateStudent(Student student);
	public int addProject(Project project);
}
