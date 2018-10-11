package com.example.megaclan.CourseBookingSystem.repositories.customerRepositories;

import com.example.megaclan.CourseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
}
