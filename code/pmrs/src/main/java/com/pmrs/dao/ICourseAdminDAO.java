package com.pmrs.dao;

import com.pmrs.pojos.CourseAdmin;

/**
 * 
 * @author ash
 *
 */

public interface ICourseAdminDAO extends ICourseDAO, IStudentDAO, IMentorDAO{
	
	CourseAdmin getCourseAdmin(CourseAdmin courseAdmin);
	
	CourseAdmin addCourseAdmin(CourseAdmin courseAdmin);
	
	boolean updateCourseAdmin(CourseAdmin courseAdmin);
	
}
