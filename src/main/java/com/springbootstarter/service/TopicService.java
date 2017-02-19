package com.springbootstarter.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootstarter.Topic;
import com.springbootstarter.dao.TopicDao;

@Service
public class TopicService {

	@Autowired
	private TopicDao topicDao;
	static Logger log = Logger.getLogger(TopicService.class.getName());
	public List<Topic> getAllTopics(){
		log.debug("Get all topics method called");
		List<Topic> topics= new ArrayList<Topic>();
		if(topicDao.count()>0)
		topicDao.findAll().forEach(topics::add);
		else
			log.error("No record found!!");
		log.debug("getAllTopics method ended");
		return topics;
	}

	public Topic getTopic(String id){
		log.debug("getTopic method called");
		if(topicDao.exists(id))
			return topicDao.findOne(id);
		else{
			log.error("No Id found: "+ id);
			return null;
		}
	}

	public void addTopic(Topic topic){
		if(!topicDao.exists(topic.getId()))
			topicDao.save(topic);
		else
			log.error("Id is present");
	}

	public void updateTopic(Topic topic, String id){
		if(topicDao.exists(id))
			topicDao.save(topic);
		else
			log.error("Id not present");
	}

	public void deleteTopic(Topic topic, String id) {
		if(topicDao.exists(id))
			topicDao.delete(id);
		else
			log.error("Id not present");
	}
}
