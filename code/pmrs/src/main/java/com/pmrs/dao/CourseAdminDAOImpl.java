package com.pmrs.dao;

import org.springframework.stereotype.Repository;

import com.pmrs.idao.ICourseAdminDAO;
import com.pmrs.pojos.CourseAdmin;

@Repository
public class CourseAdminDAOImpl extends AbstractGenericDAOImpl<CourseAdmin, Integer> implements ICourseAdminDAO{

}
