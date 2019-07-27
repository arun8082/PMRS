package com.pmrs.service;

import java.util.List;

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

import com.pmrs.idao.ICourseAdminDAO;
import com.pmrs.idao.IGenericDAO;
import com.pmrs.iservice.ICourseAdminService;
import com.pmrs.pojos.CourseAdmin;
import com.pmrs.pojos.Student;

@Service
@Transactional
public class CourseAdminServiceImpl extends GenericServiceImpl<CourseAdmin, Integer> implements ICourseAdminService {

	private ICourseAdminDAO courseAdminDAO;

	@Autowired
	public CourseAdminServiceImpl(@Qualifier("courseAdminDAOImpl") IGenericDAO<CourseAdmin, Integer> genericDAO) {
		super(genericDAO);
		System.out.println("In courseAdminServiceImpl "+genericDAO);
		this.courseAdminDAO = (ICourseAdminDAO) genericDAO;
	}

	@Override
	public CourseAdmin authenticate(CourseAdmin admin) {
		return courseAdminDAO.authenticate(admin);
		
	}
}
