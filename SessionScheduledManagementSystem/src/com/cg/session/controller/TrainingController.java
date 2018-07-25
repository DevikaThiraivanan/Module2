package com.cg.session.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.cg.session.dto.ScheduledSessions;
import com.cg.session.service.ITrainingService;



@Controller
public class TrainingController {
	
	@Autowired
	ITrainingService trainingService;
	
	@RequestMapping(value="/showall",method=RequestMethod.GET)
	public ModelAndView getAllEmployees()
	{
		List<ScheduledSessions> list = trainingService.showSessions();
		
		return new ModelAndView("ScheduledSession","sess",list);
	}
	
	@RequestMapping(value="/successpage",method=RequestMethod.GET)
	public String showSuccess()
	{
		return "success";
		
	}
	
	

}
