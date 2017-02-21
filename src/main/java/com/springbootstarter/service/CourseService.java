package com.springbootstarter.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootstarter.Course;
import com.springbootstarter.dao.CourseDao;


@Service
public class CourseService {

	@Autowired
	private CourseDao courseDao;
	static Logger log = Logger.getLogger(CourseService.class.getName());
	public List<Course> getAllCourses(String id){
		log.debug("Get all Courses method called");
		List<Course> courses= new ArrayList<Course>();
		courseDao.findByTopicId(id).forEach(courses::add);
		System.out.println(courseDao.count()+ " count");
		System.out.println(courseDao.findByTopicId(id).size()+" size is here");
//		else
//			log.error("No record found!!");
		log.debug("getAllCourses method ended");
		return courses;
	}

	public Course getCourse(String id){
		log.debug("getCourse method called");
		if(courseDao.exists(id))
			return courseDao.findOne(id);
		else{
			log.error("No Id found: "+ id);
			return null;
		}
	}

	public void addCourse(Course Course){
		System.out.println("In add course");
			courseDao.save(Course);
		
	}

	public void updateCourse(Course Course, String id){
			courseDao.save(Course);
		
	}

	public void deleteCourse(Course Course, String id) {
		if(courseDao.exists(id))
			courseDao.delete(id);
		else
			log.error("Id not present");
	}
}
