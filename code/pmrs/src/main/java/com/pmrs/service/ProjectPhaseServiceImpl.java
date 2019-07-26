package com.pmrs.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.pmrs.dao.IGenericDAO;
import com.pmrs.dao.IProjectPhaseDAO;
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
