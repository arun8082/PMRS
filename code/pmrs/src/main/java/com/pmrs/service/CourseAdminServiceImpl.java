package com.pmrs.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.pmrs.dao.ICourseAdminDAO;
import com.pmrs.dao.IGenericDAO;
import com.pmrs.pojos.CourseAdmin;

@Service
@Transactional
public class CourseAdminServiceImpl extends GenericServiceImpl<CourseAdmin, Integer> implements ICourseAdminService {

	private ICourseAdminDAO courseAdminDAO;

	@Autowired
	public CourseAdminServiceImpl(@Qualifier("courseAdminDAOImpl") IGenericDAO<CourseAdmin, Integer> genericDAO) {
		super(genericDAO);
		this.courseAdminDAO = (ICourseAdminDAO) genericDAO;
	}

}
