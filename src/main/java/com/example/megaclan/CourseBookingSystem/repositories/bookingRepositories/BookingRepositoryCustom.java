package com.example.megaclan.CourseBookingSystem.repositories.bookingRepositories;

import com.example.megaclan.CourseBookingSystem.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom{


    List<Booking> getAllBookingsForDate(String date);
}
