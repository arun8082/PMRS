package com.pmrs.dao;

import java.util.List;
import javax.persistence.NoResultException;
import org.springframework.stereotype.Repository;
import com.pmrs.idao.IStudentDAO;
import com.pmrs.pojos.EEntityStatus;
import com.pmrs.pojos.Project;
import com.pmrs.pojos.Student;

@Repository
public class StudentDAOImpl extends AbstractGenericDAOImpl<Student, Integer> implements IStudentDAO {

	@Override
	public Student authenticateStudent(Student student) {
		try {
			String jpql = "select s from Student s where s.email=:email and s.password=:pwd";
			Student st = entityManager.createQuery(jpql, Student.class).setParameter("email", student.getEmail())
					.setParameter("pwd", student.getPassword()).getSingleResult();
			if (st.getStatus() == EEntityStatus.ACTIVE) {
				return st;
			} else {
				Student s = new Student();
				s.setStatus(EEntityStatus.INACTIVE);
				return s;
			}

		} catch (NoResultException ex) {
			return null;
		}
	}

	@Override
	public List<Student> listAll(Project projectId) {
		return entityManager.createQuery("from Student s where s.studentProjectId=:projectId", Student.class)
				.setParameter("projectId", projectId).getResultList();
	}

}
