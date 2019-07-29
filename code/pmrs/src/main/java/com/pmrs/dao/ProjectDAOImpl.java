package com.pmrs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pmrs.idao.IProjectDAO;
import com.pmrs.pojos.Mentor;
import com.pmrs.pojos.Project;

@Repository
public class ProjectDAOImpl extends AbstractGenericDAOImpl<Project, Integer> implements IProjectDAO {

	@Override
	public List<Project> listAll(Mentor mentorId) {
		return entityManager.createQuery("from Project p where p.mentorId=:mentorId", Project.class)
				.setParameter("mentorId", mentorId).getResultList();
	}

}
