package trivera.update.reflection.domain;

import java.time.LocalDate;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera Technologies
 *
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of the Trivera
 * Group, Inc.
 *
 * Copyright (c) 2017 Trivera Technologies, LLC. http://www.triveratech.com
 * 
 * </p>
 * 
 * @author Trivera Technologies Tech Team.
 */
public class TravelServiceImpl implements TravelService {

	@Override
	public long addBooking(String destination, LocalDate date) {
		// For illustration purposed only
		System.out.println(String.format(
				"Booking for %s at %s has been processed", destination, date));
		return 0;
	}

	@Override
	public void removeBooking(long bookingID) {
		// For illustration purposed only
		System.out.println(String.format("Booking with id has been removed",
				bookingID));
	}

	@Override
	public void addBooking(String destination, RentalCarType rentalCarType,
			LocalDate date) {
		// For illustration purposed only
		System.out.println(String.format(
				"Booking for %s with %s car at %s has been processed",
				destination, rentalCarType, date));
	}

}
