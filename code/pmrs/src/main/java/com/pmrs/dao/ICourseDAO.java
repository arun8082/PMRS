package com.pmrs.dao;

import java.util.List;
import com.pmrs.pojos.Course;

/**
 * 
 * @author ash
 *
 */

public interface ICourseDAO {

	public Course addCourse(Course course);

	public boolean updateCourse(Course course);

	public Course getCourse(Course course);

	public List<Course> listAllCourse();
	
	public boolean removeCourse(Course course);
	
	public boolean removeCourse(Course course, boolean force);
}
