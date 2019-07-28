package com.pmrs.idao;

import com.pmrs.pojos.Mentor;
import com.pmrs.pojos.Student;

/**
 * 
 * @author ash
 * 
 *
 */

public interface IMentorDAO extends IGenericDAO<Mentor, Integer> {

	public Mentor authenticateMentor(Mentor mentor);

}
