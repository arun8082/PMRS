package com.pmrs.idao;

import java.util.List;

import com.pmrs.pojos.Project;
import com.pmrs.pojos.Student;

/**
 * 
 * @author ash
 *
 */

public interface IStudentDAO extends IGenericDAO<Student, Integer> {

	public Student authenticateStudent(Student student);

	public List<Student> listAll(Project projectId);

}
