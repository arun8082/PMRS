package com.pmrs.service;

/**
 * @author ash
 * Every method is annotated as @Transactional.
 * Thus, we guarantee that every database operation will be wrapped with transaction.
 * Also note that genericDao field initialization has to be made in the sub-classes of GenericDaoImpl by using parameterized constructor.
 * The reason behind is that when multiple entity service classes which extends base GenericServiceImpl is used, Spring has to decide which injection is made.
 * Therefore, we allow sub entity service classes to decide which generic DAO object will be injected by using @Qualifier annotation. 
 */

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pmrs.idao.IGenericDAO;
import com.pmrs.idao.IProjectPhaseDAO;
import com.pmrs.iservice.IProjectPhaseService;
import com.pmrs.pojos.ProjectPhase;

@Service
@Transactional
public class ProjectPhaseServiceImpl extends GenericServiceImpl<ProjectPhase, Integer> implements IProjectPhaseService {

	private IProjectPhaseDAO projectPhaseDAO;
	
	public ProjectPhaseServiceImpl() {
		System.out.println("ProjectPhaseService ctor");
	}
	
	@Autowired
	public ProjectPhaseServiceImpl(@Qualifier("projectPhaseDAOImpl") IGenericDAO<ProjectPhase, Integer> genericDAO) {
		super(genericDAO);
		this.projectPhaseDAO = (IProjectPhaseDAO) genericDAO;
	}

}
