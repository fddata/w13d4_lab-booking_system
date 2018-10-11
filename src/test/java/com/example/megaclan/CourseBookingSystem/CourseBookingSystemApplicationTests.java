package com.example.megaclan.CourseBookingSystem;

import com.example.megaclan.CourseBookingSystem.models.Course;
import com.example.megaclan.CourseBookingSystem.models.Customer;
import com.example.megaclan.CourseBookingSystem.repositories.bookingRepositories.BookingRepository;
import com.example.megaclan.CourseBookingSystem.repositories.courseRepositories.CourseRepository;
import com.example.megaclan.CourseBookingSystem.repositories.customerRepositories.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingSystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetAllCoursesByRating() {
		List<Course> found = courseRepository.getCoursesWithRating(1);
		assertEquals(1, found.size());
		assertEquals("JobbyCourse", found.get(0).getName());
	}

	@Test
	public void canGetAllCustomersForCourse() {
		List<Customer> found = customerRepository.getAllCustomersForCourse(2L);
		assertEquals(2, found.size());
	}

	@Test
	public void canGetAllCoursesForCustomer() {
		List<Course> found = courseRepository.getAllCoursesForCustomer(2L);
		assertEquals(2, found.size());
	}
}
