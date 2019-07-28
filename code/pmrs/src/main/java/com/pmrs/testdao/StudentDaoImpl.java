package com.pmrs.testdao;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.pmrs.pojos.Project;
import com.pmrs.pojos.Student;

@Repository
public class StudentDaoImpl implements IStudentDao{
	
	@PersistenceContext
	private EntityManager entityManager;
		
	@Override
	public int registerStudent(Student student) {
		int studentId;	
		Session sf = entityManager.unwrap(Session.class);
		studentId=(int) sf.save(student);
		student.setPrn(generatePrn(studentId));//getting 12 digits prn
		sf.update(student);//updating prn in the table
		return studentId;
	}

	@Override
	public Student getStudentDetails(Student student) {
		Session sf = entityManager.unwrap(Session.class);
		student=sf.get(Student.class, student.getStudentId());
		return student;
	}

	/**
	 * Function to Generate 12 digit prn
	 */
	@Override
	public String generatePrn(int studentId) {
		String centerCode="40";
		String CourseCode="12";
		//getting current date and month
		String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyMM"));
		String prn = date+centerCode+CourseCode;
		
		//Converting student prn into 4 digits prn
		NumberFormat f = new DecimalFormat("0000");
	    String extendedSID = String.valueOf(f.format(studentId));
		
	    //System.out.println(prn+extendedSID);		
		return prn+extendedSID;
	}

	@Override
	public Student authenticateStudent(Student student) {
		Session sf = entityManager.unwrap(Session.class);
		String jpql = "Select s from Student s where s.prn=:prn and s.studentEmail=:studentEmail";
		try {
		Student stud = sf.createQuery(jpql, Student.class).setParameter("prn", student.getPrn())
				.setParameter("studentEmail", student.getEmail()).getSingleResult();
			if(stud.getEmail().equals(student.getEmail())
					&& stud.getPrn().equals(student.getPrn())) {
				return stud;
			}
		}catch (NoResultException e) {
			return null;
		}
		return null;
	}

	@Override
	public int addProject(Project project) {
		project.setProjectCreated(LocalDate.now());
		entityManager.persist(project);
		return project.getProjectId();
	}
	
}
