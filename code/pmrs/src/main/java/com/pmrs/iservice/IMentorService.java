package com.pmrs.iservice;

import com.pmrs.pojos.Mentor;
import com.pmrs.pojos.Student;

public interface IMentorService extends IGenericService<Mentor, Integer>{

	public Mentor authenticateMentor(Mentor mentor);

}
