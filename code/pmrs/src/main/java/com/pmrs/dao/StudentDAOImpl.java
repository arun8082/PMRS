package com.pmrs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.pmrs.idao.IStudentDAO;
import com.pmrs.pojos.EEntityStatus;
import com.pmrs.pojos.Student;

@Repository
public class StudentDAOImpl extends AbstractGenericDAOImpl<Student, Integer> implements IStudentDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Student authenticateStudent(Student student) {
		try {
			String jpql = "select s from Student s where s.email=:email and s.password=:pwd";
			Student st = em.createQuery(jpql, Student.class).setParameter("email", student.getEmail())
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
	public List<Student> getMemberList(int projectId) {
		try {
			String jpql = "select s from Student where s.studentProjectId=:projectid";
			List<Student> st = em.createQuery(jpql, Student.class).setParameter("projectid", projectId).getResultList();

			if (st != null) {
				return st;
			} else {
				return null;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

	}

}
