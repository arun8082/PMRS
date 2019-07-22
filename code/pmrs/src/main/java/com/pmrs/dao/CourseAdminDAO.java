package com.pmrs.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.pmrs.pojos.Course;
import com.pmrs.pojos.CourseAdmin;
import com.pmrs.pojos.Mentor;
import com.pmrs.pojos.Project;
import com.pmrs.pojos.Student;

/**
 * 
 * @author ash
 *
 */

@Repository
@Transactional
public class CourseAdminDAO implements ICourseAdminDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public Course addCourse(Course course) {
		getCurrentSession().persist(course);
		return course;
	}

	@Override
	public boolean updateCourse(Course course) {
		if (getCurrentSession().merge(course) != null)
			return true;
		else
			return false;
	}

	@Override
	public Course getCourse(Course course) {
		return getCurrentSession().get(Course.class, course.getCourseId());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Course> listAllCourse() {
		return getCurrentSession().createQuery("from " + Course.class.getName()).list();
	}

	@Override
	public boolean removeCourse(Course course) {
		try {
			getCurrentSession().remove(course);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Student addStudent(Student student) {
		getCurrentSession().persist(student);
		return student;
	}

	@Override
	public boolean updateStudent(Student student) {
		if (getCurrentSession().merge(student) != null)
			return true;
		else
			return false;
	}

	@Override
	public Student getStudent(Student student) {
		return getCurrentSession().get(Student.class, student.getStudentId());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> listAllStudent() {
		return getCurrentSession().createQuery("from " + Student.class.getName()).list();
	}

	@Override
	public boolean removeStudent(Student student) {
		try {
			getCurrentSession().remove(student);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Project addProject(Project project) {
		getCurrentSession().persist(project);
		return project;
	}

	@Override
	public boolean updateProject(Project project) {
		if (getCurrentSession().merge(project) != null)
			return true;
		else
			return false;
	}

	@Override
	public Project getProject(Project project) {
		return getCurrentSession().get(Project.class, project.getProjectId());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Project> listAllProject() {
		return getCurrentSession().createQuery("from " + Project.class.getName()).list();
	}

	@Override
	public boolean removeProject(Project project) {
		try {
			getCurrentSession().remove(project);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Mentor addMentor(Mentor mentor) {
		getCurrentSession().persist(mentor);
		return mentor;
	}

	@Override
	public boolean updateMentor(Mentor mentor) {
		if (getCurrentSession().merge(mentor) != null)
			return true;
		else
			return false;
	}

	@Override
	public Mentor getMentor(Mentor mentor) {
		return getCurrentSession().get(Mentor.class, mentor.getMentorId());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Mentor> listAllMentors() {
		return getCurrentSession().createQuery("from " + Mentor.class.getName()).list();
	}

	@Override
	public boolean remove(Mentor mentor) {
		try {
			getCurrentSession().remove(mentor);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateCourseAdmin(CourseAdmin courseAdmin) {
		if (getCurrentSession().merge(courseAdmin) != null)
			return true;
		else
			return false;
	}

}
