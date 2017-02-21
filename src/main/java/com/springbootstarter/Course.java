package com.springbootstarter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {
	@Id
	private String id;
	private String name;
	private String desription;
	@ManyToOne
	private Topic topic;
	
	public String getId() {
		return id;
	}
	Course(){
		
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesription() {
		return desription;
	}
	public void setDesription(String desription) {
		this.desription = desription;
	}
	public Course(String id, String name, String desription, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.desription = desription;
		this.topic=new Topic(topicId,"","");
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	
}
