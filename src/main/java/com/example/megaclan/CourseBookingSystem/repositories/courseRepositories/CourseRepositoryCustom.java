package com.example.megaclan.CourseBookingSystem.repositories.courseRepositories;

import com.example.megaclan.CourseBookingSystem.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> getCoursesWithRating(int rating);
}
