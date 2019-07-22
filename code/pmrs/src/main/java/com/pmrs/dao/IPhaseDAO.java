package com.pmrs.dao;

import java.util.List;
import com.pmrs.pojos.Phase;

/**
 * 
 * @author ash
 *
 */

public interface IPhaseDAO {

	public Phase addPhase(Phase phase);

	public boolean updatePhase(Phase phase);

	public Phase getPhase(Phase phase);

	public List<Phase> listAllPhase();
	
	public boolean removePhase(Phase phase);
	
}
