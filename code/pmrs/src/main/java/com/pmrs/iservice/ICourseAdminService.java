package com.pmrs.iservice;

import java.util.List;

import com.pmrs.pojos.CourseAdmin;
import com.pmrs.pojos.Student;

public interface ICourseAdminService extends IGenericService<CourseAdmin, Integer>{

	public CourseAdmin authenticate(CourseAdmin admin);

	
}
