package com._SpringCourse_RestAPI.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com._SpringCourse_RestAPI.Model.Course;


@RestController
@RequestMapping("/course")
public class CourseController {
	
		
	
	
	@GetMapping
	public List<Course> getPublicCourses(){
		
	List<Course> courses = new ArrayList<>();
	courses.add(new Course(1, "Java Course", "Java by Deepak"));
	courses.add(new Course(2, "C Course", "Java by C. Deepak"));
	courses.add(new Course(3, "C++ Course", "Java by CPP Deepak"));
	courses.add(new Course(4, "Python Course", "Java by Python Deepak"));
	courses.add(new Course(5, "Azure Course", "Java by Azure Deepak"));
		
		return courses;
	}
}
