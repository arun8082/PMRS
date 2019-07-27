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

import com.pmrs.idao.ICourseDAO;
import com.pmrs.idao.IGenericDAO;
import com.pmrs.iservice.ICourseService;
import com.pmrs.pojos.Course;

@Service
@Transactional
public class CourseServiceImpl extends GenericServiceImpl<Course, Integer> implements ICourseService {

	private ICourseDAO courseDAO;

	@Autowired
	public CourseServiceImpl(@Qualifier("courseDAOImpl") IGenericDAO<Course, Integer> genericDAO) {
		super(genericDAO);
		this.courseDAO = (ICourseDAO) genericDAO;
	}

}
