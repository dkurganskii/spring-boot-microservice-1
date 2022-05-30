package com.sha.springbootmicroservice.repository;

import com.sha.springbootmicroservice.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>
{
    //findBy+fieldName
}