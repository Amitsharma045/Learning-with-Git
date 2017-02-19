package com.springbootstarter.dao;

import org.springframework.data.repository.CrudRepository;

import com.springbootstarter.Topic;

public interface TopicDao extends CrudRepository<Topic, String> {

}
