package com.pmrs.idao;

import java.util.List;

import com.pmrs.pojos.CourseAdmin;
import com.pmrs.pojos.Student;

/**
 * 
 * @author ash
 *
 */

public interface ICourseAdminDAO extends IGenericDAO< CourseAdmin, Integer >{

	public CourseAdmin authenticate(CourseAdmin admin);
	
}
