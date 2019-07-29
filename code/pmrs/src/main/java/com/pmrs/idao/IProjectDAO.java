package com.pmrs.idao;

import java.util.List;
import com.pmrs.pojos.Mentor;
import com.pmrs.pojos.Project;

/**
 * 
 * @author ash
 *
 */

public interface IProjectDAO extends IGenericDAO<Project, Integer> {

	List<Project> listAll(Mentor mentor);
}
