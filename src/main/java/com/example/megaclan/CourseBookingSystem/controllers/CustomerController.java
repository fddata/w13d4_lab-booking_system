package com.example.megaclan.CourseBookingSystem.controllers;


import com.example.megaclan.CourseBookingSystem.models.Course;
import com.example.megaclan.CourseBookingSystem.repositories.courseRepositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/{id}/courses")
    public List<Course> getAllCoursesForCustomer(@PathVariable Long id){
        return courseRepository.getAllCoursesForCustomer(id);
    }
}
