package com.springbootstarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootstarter.Topic;
import com.springbootstarter.service.TopicService;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicService.getAllTopics();
	}
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable("id") String id ){
		return topicService.getTopic(id);
	}
	@RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, value ="/topics")
	public void addTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
	}
	
	
	
}
