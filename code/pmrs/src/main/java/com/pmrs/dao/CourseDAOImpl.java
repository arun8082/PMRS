package com.pmrs.dao;

import org.springframework.stereotype.Repository;

import com.pmrs.idao.ICourseDAO;
import com.pmrs.pojos.Course;

@Repository
public class CourseDAOImpl extends AbstractGenericDAOImpl<Course, Integer> implements ICourseDAO {

}
