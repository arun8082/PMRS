package com.pmrs.dao;

import java.util.List;
import com.pmrs.pojos.Student;

/**
 * 
 * @author ash
 *
 */

public interface IStudentDAO extends IProjectDAO {

	public Student addStudent(Student student);

	public boolean updateStudent(Student student);

	public Student getStudent(Student student);

	public List<Student> listAllStudent();
	
	public boolean removeStudent(Student student);
	
	public boolean removeStudent(Student student, boolean force);
}
