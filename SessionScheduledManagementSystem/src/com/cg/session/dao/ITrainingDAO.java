package com.cg.session.dao;

import java.util.List;

import com.cg.session.dto.ScheduledSessions;

public interface ITrainingDAO {
	
	public List<ScheduledSessions> showSessions();

}
