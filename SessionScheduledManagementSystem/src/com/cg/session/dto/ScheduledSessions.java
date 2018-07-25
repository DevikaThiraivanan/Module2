package com.cg.session.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="scheduledsessions")
public class ScheduledSessions {
	
	
	
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="duration")
	private int duration;

	@Column(name="faculty")
	private String faculty;
	
	@Column(name="mode1")
	private String mode1;
	
	
	
	
	
	
	
	public ScheduledSessions(int id, String name, int duration, String faculty, String mode1) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.faculty = faculty;
		this.mode1 = mode1;
	}
	
	public ScheduledSessions()
	{
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getMode1() {
		return mode1;
	}
	public void setMode1(String mode1) {
		this.mode1 = mode1;
	}
	
	@Override
	public String toString() {
		return "ScheduleTraining [id=" + id + ", name=" + name + ", duration=" + duration + ", faculty=" + faculty
				+ ", mode1=" + mode1 + "]";
	}
	
	
	

}
