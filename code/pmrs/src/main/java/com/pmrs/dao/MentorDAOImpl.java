package com.pmrs.dao;

import org.springframework.stereotype.Repository;

import com.pmrs.idao.IMentorDAO;
import com.pmrs.pojos.Mentor;

@Repository
public class MentorDAOImpl extends AbstractGenericDAOImpl<Mentor, Integer> implements IMentorDAO {

}
