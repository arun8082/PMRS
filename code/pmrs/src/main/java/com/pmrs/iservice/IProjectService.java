package com.pmrs.iservice;

import java.util.List;

import com.pmrs.pojos.Mentor;
import com.pmrs.pojos.Project;

public interface IProjectService extends IGenericService<Project, Integer> {
	List<Project> listAll(Mentor mentor);
}
