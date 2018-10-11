package com.example.megaclan.CourseBookingSystem.repositories.courseRepositories;

import com.example.megaclan.CourseBookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
}
