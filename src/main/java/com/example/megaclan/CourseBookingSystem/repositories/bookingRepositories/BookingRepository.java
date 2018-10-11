package com.example.megaclan.CourseBookingSystem.repositories.bookingRepositories;

import com.example.megaclan.CourseBookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
}
