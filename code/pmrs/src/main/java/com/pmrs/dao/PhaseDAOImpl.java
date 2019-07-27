package com.pmrs.dao;

import org.springframework.stereotype.Repository;

import com.pmrs.idao.IPhaseDAO;
import com.pmrs.pojos.Phase;

@Repository
public class PhaseDAOImpl extends AbstractGenericDAOImpl<Phase, Integer> implements IPhaseDAO {

}
