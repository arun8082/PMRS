package com.pmrs.dao;

import java.util.List;
import com.pmrs.pojos.Project;

/**
 * 
 * @author ash
 *
 */

public interface IProjectDAO {

	public Project addProject(Project project);

	public boolean updateProject(Project project);

	public Project getProject(Project project);

	public List<Project> listAllProject();
	
	public boolean removeProject(Project project);
	
}
