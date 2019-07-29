package com.pmrs.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.pmrs.idao.ICourseAdminDAO;
import com.pmrs.pojos.CourseAdmin;
import com.pmrs.pojos.EEntityStatus;

@Repository
public class CourseAdminDAOImpl
		extends AbstractGenericDAOImpl<CourseAdmin, Integer>
		implements ICourseAdminDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public CourseAdmin authenticate(CourseAdmin admin) {
		String jpql = "select c from CourseAdmin c where c.email=:email and c.password=:password";
		try {
			CourseAdmin ca = em.createQuery(jpql, CourseAdmin.class)
					.setParameter("email", admin.getEmail())
					.setParameter("password", admin.getPassword())
					.getSingleResult();
			System.out.println(ca);
			if (ca.getStatus() == EEntityStatus.ACTIVE) {
				return ca;
			} else {
				ca = new CourseAdmin();
				ca.setStatus(EEntityStatus.INACTIVE);
				return ca;
			}
		} catch (NoResultException e) {
			return null;
		}
	}

}
