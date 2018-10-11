package com.example.megaclan.CourseBookingSystem.controllers;


import com.example.megaclan.CourseBookingSystem.models.Course;
import com.example.megaclan.CourseBookingSystem.models.Customer;
import com.example.megaclan.CourseBookingSystem.repositories.courseRepositories.CourseRepository;
import com.example.megaclan.CourseBookingSystem.repositories.customerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses" )
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping ("/rating/{rating}")
    public List<Course> getCoursesWithRating(@PathVariable int rating){
    return courseRepository.getCoursesWithRating(rating);
    }

    @GetMapping("/{id}/customers")
    public List<Customer> getAllCustomersForCourse(@PathVariable Long id){
        return customerRepository.getAllCustomersForCourse(id);
    }

    @GetMapping("/{id}/customers/town/{town}")
    public List<Customer> getAllCustomersForTownForCourse(@PathVariable String town, @PathVariable Long id){
        return customerRepository.getAllCustomersForTownForCourse(town, id);
    }
}
