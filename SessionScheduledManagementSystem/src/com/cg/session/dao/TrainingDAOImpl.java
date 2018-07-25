package com.cg.session.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.session.dto.ScheduledSessions;

@Repository("itrainingdao")
public class TrainingDAOImpl implements ITrainingDAO{
	
	
	
	@Autowired
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<ScheduledSessions> showSessions() {
		// TODO Auto-generated method stub
		
		List<ScheduledSessions> list = new ArrayList<ScheduledSessions>();
		Query q = entityManager.createQuery("from ScheduledSessions");
		list = q.getResultList();
		return list;
		
	}

}
