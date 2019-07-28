package com.pmrs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.pmrs.idao.IStudentDAO;
import com.pmrs.pojos.Student;

@Repository
public class StudentDAOImpl extends AbstractGenericDAOImpl<Student, Integer> implements IStudentDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Student authenticateStudent(Student student) {
		try {
			System.out.println("In student login DAO");
			String jpql = "select s from Student s where s.studentEmail=:email and s.studentpassword=:pwd";
			Student st = em.createQuery(jpql, Student.class).setParameter("email", student.getStudentEmail())
					.setParameter("pwd", student.getStudentpassword()).getSingleResult();

			if (st != null) {
				return st;
			} else {
				return null;
			}

		} catch (NoResultException ex) {
			System.out.println("Exception");
			return null;
		}
	}

	@Override
	public List<Student> getMemberList(int projectId) {
		try {
			System.out.println("In Student get member list");
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
