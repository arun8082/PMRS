package com.pmrs.testdao;

import com.pmrs.pojos.Project;
import com.pmrs.pojos.Student;

public interface IStudentDao {
	public int registerStudent(Student student);
	public Student getStudentDetails(Student student);
	public String generatePrn(int id);
	public Student authenticateStudent(Student student);
	public int addProject(Project project);
}
