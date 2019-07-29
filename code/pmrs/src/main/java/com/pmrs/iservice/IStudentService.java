package com.pmrs.iservice;

import java.util.List;

import com.pmrs.pojos.Project;
import com.pmrs.pojos.Student;

public interface IStudentService extends IGenericService<Student, Integer> {

	public Student authenticateStudent(Student student);

	public List<Student> listAll(Project projectId);

}
