package trivera.datetime.appointment;

import trivera.datetime.client.swing.AppointmentScheduler;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera
 * Technologies
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
public class AppointmentFactory {

	/**
	 * Create an instance of Appointment with the given description at EXACTLY
	 * the given moment in time
	 * 
	 * @param description
	 *            Description of the appointment
	 * @param year
	 *            the Year of the appointment
	 * @param month
	 *            the month (1-12) of the appointment
	 * @param day
	 *            the day of the appointment
	 * @param hour
	 *            the hour (0-24) of the appointment
	 * @param minute
	 *            the minute of the appointment
	 */
	public void createAppointment(String description, int year, int month, int day, int hour, int minute) {
		 
		Appointment appt = new Appointment(description,LocalDateTime.of(year,month,day,hour,minute,0));
		addAppointment(appt);
		
	}

	/**
	 * Create daily appointments (maximum 7) at EXACTLY the given
	 * moment, starting at the moment provided The appointment should be every
	 * day at the same moment!
	 * 
	 * @param description
	 *            Description of the appointment
	 * @param year
	 *            the Year of the first appointment
	 * @param month
	 *            the month (1-12) of the first appointment
	 * @param day
	 *            the day of the first appointment
	 * @param hour
	 *            the hour (0-24) of the first appointment
	 * @param minute
	 *            the minute of the first appointment
	 */
	public void createDailyAppointment(String description, int year, int month, int day, int hour, int minute) {

		
		

		// Restrict the number of appointments !!!
		LocalDateTime dt = LocalDateTime.of(year,month,day,hour,minute,0);

		for(int i=0;i<7;i++){
			addAppointment(new Appointment(description,dt));
			dt = dt.plusDays(1);
		}

		
		
	}

	/**
	 * Create an appointment instance for the first day of next month (at noon)
	 * 
	 * @param description
	 *            Description of the appointment
	 */
	public void createFirstDayOfNextMonthAppointment(String description) {

		LocalDateTime date = LocalDateTime
				.now()
				// at noon
				.withHour(12)
				.withMinute(0)
				.withSecond(0);
		Appointment appt = new Appointment(description,date.with(TemporalAdjusters.firstDayOfNextMonth()));
		addAppointment(appt);
		
		
	}

	/**
	 * Create a Set of appointments (maximum 7) that occur every X minutes,
	 * starting at the current time
	 * 
	 * @param description
	 *            Description of the appointment
	 * @param minutes
	 *            the amount of minutes inbetween appointments
	 */
	public void createRepeatingAppointment(String description, int minutes) {

		LocalDateTime dt = LocalDateTime.now();
		for(int i=0;i<7;i++){
			addAppointment(new Appointment(description,dt));
			dt = dt.plusMinutes(minutes);
		}
		
		
	}

	/**
	 * Create appointments (maximum 7) that occur at the EXACT moment
	 * on the given day
	 * 
	 * @param description
	 *            Description of the appointment
	 * @param hour
	 *            the hour (0-24) of the appointment
	 * @param minute
	 *            the minute of the appointment
	 * @param dayOfWeek
	 *            The day of the week on which this appointment takes place
	 */
	public void createDayAppointments(String description, int hour, int minute, DayOfWeek dayOfWeek) {

		LocalDateTime dt = LocalDateTime
				.now()
				.withHour(hour)
				.withMinute(minute)
				.with(TemporalAdjusters.nextOrSame(dayOfWeek));

		for(int i=0;i<7;i++){
			addAppointment(new Appointment(description,dt));
			dt = dt.with(TemporalAdjusters.next(dayOfWeek));
		}
		
	}

	/**
	 * Notify all schedulers of the new appointment
	 * 
	 * @param appointment
	 *            the Appointment
	 */
	private void addAppointment(Appointment appointment) {
		if (appointment == null)
			return;
		for (AppointmentScheduler scheduler : schedulers) {
			scheduler.addAppointment(appointment);
		}
	}

	// Instance variables
	private AppointmentScheduler[] schedulers;

	/**
	 * Constructor
	 * 
	 * @param schedulers
	 *            zero or more schedulers
	 */
	public AppointmentFactory(AppointmentScheduler... schedulers) {
		this.schedulers = schedulers;
	}
}
