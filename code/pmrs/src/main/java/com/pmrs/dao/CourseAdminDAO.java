package com.pmrs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public CourseAdmin getCourseAdmin(CourseAdmin courseAdmin) {
		System.out.println(courseAdmin.getCourseAdminId());
		return entityManager.find(CourseAdmin.class, courseAdmin.getCourseAdminId());
	}
	
	@Override
	public CourseAdmin addCourseAdmin(CourseAdmin courseAdmin) {
		entityManager.persist(courseAdmin);
		return courseAdmin;
	}

	@Override
	public Course addCourse(Course course) {
		entityManager.persist(course);
		return course;
	}

	@Override
	public boolean updateCourse(Course course) {
		if (entityManager.merge(course) != null)
			return true;
		else
			return false;
	}

	@Override
	public Course getCourse(Course course) {
		return entityManager.find(Course.class, course.getCourseId());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Course> listAllCourse() {
		return entityManager.createQuery("from " + Course.class.getName()).getResultList();
	}

	@Override
	public boolean removeCourse(Course course) {
		try {
			entityManager.remove(course);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Student addStudent(Student student) {
		entityManager.persist(student);
		return student;
	}

	@Override
	public boolean updateStudent(Student student) {
		if (entityManager.merge(student) != null)
			return true;
		else
			return false;
	}

	@Override
	public Student getStudent(Student student) {
		return entityManager.find(Student.class, student.getStudentId());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> listAllStudent() {
		return entityManager.createQuery("from " + Student.class.getName()).getResultList();
	}

	@Override
	public boolean removeStudent(Student student) {
		try {
			entityManager.remove(student);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Project addProject(Project project) {
		entityManager.persist(project);
		return project;
	}

	@Override
	public boolean updateProject(Project project) {
		if (entityManager.merge(project) != null)
			return true;
		else
			return false;
	}

	@Override
	public Project getProject(Project project) {
		return entityManager.find(Project.class, project.getProjectId());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Project> listAllProject() {
		return entityManager.createQuery("from " + Project.class.getName()).getResultList();
	}

	@Override
	public boolean removeProject(Project project) {
		try {
			entityManager.remove(project);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Mentor addMentor(Mentor mentor) {
		entityManager.persist(mentor);
		return mentor;
	}

	@Override
	public boolean updateMentor(Mentor mentor) {
		if (entityManager.merge(mentor) != null)
			return true;
		else
			return false;
	}

	@Override
	public Mentor getMentor(Mentor mentor) {
		return entityManager.find(Mentor.class, mentor.getMentorId());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Mentor> listAllMentors() {
		return entityManager.createQuery("from " + Mentor.class.getName()).getResultList();
	}

	@Override
	public boolean remove(Mentor mentor) {
		try {
			entityManager.remove(mentor);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateCourseAdmin(CourseAdmin courseAdmin) {
		if (entityManager.merge(courseAdmin) != null)
			return true;
		else
			return false;
	}

}
