package com.centum.codeWithSharath.repository;

import com.centum.codeWithSharath.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Long> {
    List<Course> findByFeeLessThan(double price);
}
