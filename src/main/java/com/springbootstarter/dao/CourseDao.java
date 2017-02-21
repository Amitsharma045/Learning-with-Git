package com.springbootstarter.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springbootstarter.Course;

public interface CourseDao extends CrudRepository<Course, String> {

	public List<Course> findByTopicId(String id);
}
