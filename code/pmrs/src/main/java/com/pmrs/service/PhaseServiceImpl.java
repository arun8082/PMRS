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
import com.pmrs.idao.IPhaseDAO;
import com.pmrs.iservice.IPhaseService;
import com.pmrs.pojos.Phase;

public class PhaseServiceImpl extends GenericServiceImpl<Phase, Integer> implements IPhaseService {

	private IPhaseDAO phaseDAO;

	@Autowired
	public PhaseServiceImpl(@Qualifier("phaseServiceImpl") IGenericDAO<Phase, Integer> genericDAO) {
		super(genericDAO);
		this.phaseDAO = (IPhaseDAO) genericDAO;
	}

}
