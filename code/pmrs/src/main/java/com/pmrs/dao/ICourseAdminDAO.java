package com.pmrs.dao;

import com.pmrs.pojos.CourseAdmin;

/**
 * 
 * @author ash
 *
 */

public interface ICourseAdminDAO extends ICourseDAO, IStudentDAO, IMentorDAO{
	
	public boolean updateCourseAdmin(CourseAdmin courseAdmin);
	
}
