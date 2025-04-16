package com.selenium.test.flightreservation.model;

/**
 * Represents a data record for user information and travel details.
 */
public record FlightReservationTestData(
        String firstName,
        String lastName,
        String email,
        String password,
        String street,
        String city,
        String zip,
        String passengerCount,
        String expectedPrice
) {}
