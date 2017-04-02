package trivera.update.lambda.compare.agenda;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

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

public class AgendaItemDAO {
	private static Random randomizer = new Random();

	public static List<AgendaItem> getAgendaItems() {
		List<AgendaItem> items = new ArrayList<>();

		items.add(new AgendaItem("Java Discussion", "Room 4.12",
				generateRandomDate()));
		items.add(new AgendaItem("Holiday Planning", "Room 1.22",
				generateRandomDate()));

		items.add(new AgendaItem("Board meeting", "Room 1.22",
				generateRandomDate()));

		items.add(new AgendaItem("Dentist", "Far Away", generateRandomDate()));
		items.add(new AgendaItem("Jennifer", "Home", generateRandomDate()));

		return items;
	}

	private static Date generateRandomDate() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, randomizer.nextInt(365));
		cal.add(Calendar.HOUR_OF_DAY, randomizer.nextInt(24));
		cal.add(Calendar.MINUTE, randomizer.nextInt(60));
		return cal.getTime();
	}
}
