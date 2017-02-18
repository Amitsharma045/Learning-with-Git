package com.springbootstarter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootstarter.Topic;

@Service
public class TopicService {
	List<Topic> topics= new ArrayList<>( Arrays.asList(
			new Topic("C","C","C is a Language"),
			new Topic("C++","C++","C++ is a Language"),
			new Topic("Java","Java","Java is a Language"),
			new Topic("Python","Python","Python is a Language")));

	public List<Topic> getAllTopics(){
		return topics;
	}

	public Topic getTopic(String id){
		return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic){
		topics.add(topic);
	}
	
	public void updateTopic(Topic topic, String id){
		Topic updateTopic=topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
		updateTopic.setDesription(topic.getDesription());
		updateTopic.setName(topic.getName());
	}

	public void deleteTopic(Topic topic, String id) {
		topics.remove(topics.stream().filter(t-> t.getId().equals(id)).findFirst().get());
		
	}
}
