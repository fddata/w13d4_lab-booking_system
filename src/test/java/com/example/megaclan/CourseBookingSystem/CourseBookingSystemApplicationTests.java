package com.example.megaclan.CourseBookingSystem;

import com.example.megaclan.CourseBookingSystem.models.Booking;
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

	@Test
	public void canGetAllBookingsForDate() {
		List<Booking> found = bookingRepository.getAllBookingsForDate("01-01-19");
		assertEquals(2, found.size());
	}

	@Test
	public void canGetAllCustomersForTownForCourse() {
		List<Customer> found = customerRepository.getAllCustomersForTownForCourse("Inverness", 1L);
		assertEquals(2, found.size());
	}

	@Test
	public void canGetAllCustomersForTownForCourseOverAge() {
		List<Customer> foundAll = customerRepository.getAllCustomersForTownForCourseOverAge("Inverness", 1L, 25);
		assertEquals(2, foundAll.size());
		List<Customer> foundOne = customerRepository.getAllCustomersForTownForCourseOverAge("Inverness", 1L, 35);
		assertEquals(1, foundOne.size());
		List<Customer> foundNone = customerRepository.getAllCustomersForTownForCourseOverAge("Inverness", 1L, 50);
		assertEquals(0, foundNone.size());
	}
}
