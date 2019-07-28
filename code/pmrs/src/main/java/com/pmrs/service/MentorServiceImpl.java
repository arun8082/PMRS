package com.pmrs.service;

import javax.transaction.Transactional;

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
import org.springframework.stereotype.Service;

import com.pmrs.idao.IGenericDAO;
import com.pmrs.idao.IMentorDAO;
import com.pmrs.iservice.IMentorService;
import com.pmrs.pojos.Mentor;
import com.pmrs.pojos.Student;

@Service
@Transactional
public class MentorServiceImpl extends GenericServiceImpl<Mentor, Integer> implements IMentorService {

	private IMentorDAO mentorDAO;

	@Autowired
	public MentorServiceImpl(@Qualifier("mentorDAOImpl") IGenericDAO<Mentor, Integer> genericDAO) {
		super(genericDAO);
		this.mentorDAO = (IMentorDAO) genericDAO;
	}

	@Override
	public Mentor authenticateMentor(Mentor mentor) {
		return mentorDAO.authenticateMentor(mentor);
	}

}
