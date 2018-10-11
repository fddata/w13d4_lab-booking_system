package com.example.megaclan.CourseBookingSystem.repositories.customerRepositories;

import com.example.megaclan.CourseBookingSystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {


    List<Customer> getAllCustomersForCourse(Long course_id);
}
