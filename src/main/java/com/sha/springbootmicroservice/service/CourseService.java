package com.sha.springbootmicroservice.service;

import com.sha.springbootmicroservice.model.Course;

import java.util.List;

public interface CourseService {
    Course saveCourse(Course course);

    void deleteCourse(Long courseId);

    List<Course> findAllCourses();
}
