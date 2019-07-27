package com.pmrs.service;

/**
 * @author ash
 * Every method is annotated as @Transactional.
 * Thus, we guarantee that every database operation will be wrapped with transaction.
 * Also note that genericDao field initialization has to be made in the sub-classes of GenericDaoImpl by using parameterized constructor.
 * The reason behind is that when multiple entity service classes which extends base GenericServiceImpl is used, Spring has to decide which injection is made.
 * Therefore, we allow sub entity service classes to decide which generic DAO object will be injected by using @Qualifier annotation. 
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.pmrs.idao.IGenericDAO;
import com.pmrs.idao.IProjectDAO;
import com.pmrs.iservice.IProjectService;
import com.pmrs.pojos.Project;

public class ProjectServiceImpl extends GenericServiceImpl<Project, Integer> implements IProjectService {

	private IProjectDAO projectDAO;

	@Autowired
	public ProjectServiceImpl(@Qualifier("projectServiceImpl") IGenericDAO<Project, Integer> genericDAO) {
		super(genericDAO);
		this.projectDAO = (IProjectDAO) genericDAO;
	}

}
