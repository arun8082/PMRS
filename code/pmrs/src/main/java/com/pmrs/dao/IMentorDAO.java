package com.pmrs.dao;

import java.util.List;
import com.pmrs.pojos.Mentor;

/**
 * 
 * @author ash
 * 
 *
 */

public interface IMentorDAO {

	public Mentor addMentor(Mentor mentor);

	public boolean updateMentor(Mentor mentor);

	public Mentor getMentor(Mentor mentor);

	public List<Mentor> listAllMentors();
	
	public boolean remove(Mentor mentor);
	
	public boolean remove(Mentor mentor, boolean force);

}
