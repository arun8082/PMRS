package com.pmrs.dao;

import org.springframework.stereotype.Repository;

import com.pmrs.idao.IProjectDAO;
import com.pmrs.pojos.Project;

@Repository
public class ProjectDAOImpl extends AbstractGenericDAOImpl<Project, Integer> implements IProjectDAO {

}
