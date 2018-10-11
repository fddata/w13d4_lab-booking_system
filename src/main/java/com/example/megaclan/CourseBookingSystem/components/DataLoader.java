package com.example.megaclan.CourseBookingSystem.components;


import com.example.megaclan.CourseBookingSystem.models.Booking;
import com.example.megaclan.CourseBookingSystem.models.Course;
import com.example.megaclan.CourseBookingSystem.models.Customer;
import com.example.megaclan.CourseBookingSystem.repositories.bookingRepositories.BookingRepository;
import com.example.megaclan.CourseBookingSystem.repositories.courseRepositories.CourseRepository;
import com.example.megaclan.CourseBookingSystem.repositories.customerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public void run(ApplicationArguments args){

        Course course1 = new Course("MegaCourse", "Aberdeen", 5);
        Course course2 = new Course("JobbyCourse", "Ayr", 1);
        courseRepository.save(course1);
        courseRepository.save(course2);

        Customer customer1 = new Customer("MegaMan", "Inverness", 45);
        Customer customer2 = new Customer("JobbyMan", "Inverness", 30);
        customerRepository.save(customer1);
        customerRepository.save(customer2);

        Booking booking1 = new Booking("01-06-18", customer1, course1);
        Booking booking2 = new Booking("01-11-17", customer1, course2);
        Booking booking3 = new Booking("01-01-19", customer2, course1);
        Booking booking4 = new Booking("25-12-18", customer2, course2);
        bookingRepository.save(booking1);
        bookingRepository.save(booking2);
        bookingRepository.save(booking3);
        bookingRepository.save(booking4);


    }
}
