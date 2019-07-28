package com.pmrs.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.pmrs.idao.IMentorDAO;
import com.pmrs.pojos.EEntityStatus;
import com.pmrs.pojos.Mentor;
import com.pmrs.pojos.Student;

@Repository
public class MentorDAOImpl extends AbstractGenericDAOImpl<Mentor, Integer> implements IMentorDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Mentor authenticateMentor(Mentor mentor) {
		try {
			String jpql = "select m from Mentor m where m.email=:email and m.password=:pwd";
			Mentor m = em.createQuery(jpql, Mentor.class).setParameter("email", mentor.getEmail())
					.setParameter("pwd", mentor.getPassword()).getSingleResult();
			if (m.getStatus() == EEntityStatus.ACTIVE) {
				return m;
			} else {
				m = new Mentor();
				m.setStatus(EEntityStatus.INACTIVE);
				return m;
			}

		} catch (NoResultException ex) {
			return null;
		}
	}
	
}
