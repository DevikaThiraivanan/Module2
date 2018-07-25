package com.cg.session.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.session.dao.ITrainingDAO;

import com.cg.session.dto.ScheduledSessions;


@Service("itrainingservice")
@Transactional
public class TrainingServiceImpl implements ITrainingService{

	@Autowired
	ITrainingDAO trainingDao;
	
	@Override
	public List<ScheduledSessions> showSessions() {
		// TODO Auto-generated method stub
		return trainingDao.showSessions();
	}

}
