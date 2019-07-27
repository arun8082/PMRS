package com.pmrs.dao;

import org.springframework.stereotype.Repository;

import com.pmrs.idao.IStudentDAO;
import com.pmrs.pojos.Student;

@Repository
public class StudentDAOImpl extends AbstractGenericDAOImpl<Student, Integer> implements IStudentDAO {

}
