package trivera.update.lambda.compare;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import trivera.update.lambda.compare.agenda.AgendaItem;
import trivera.update.lambda.compare.agenda.AgendaItemComparator;
import trivera.update.lambda.compare.agenda.AgendaItemDAO;

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
public class LambdaCompare {

	public static void main(String[] args) {

		List<AgendaItem> agendaItems = AgendaItemDAO.getAgendaItems();

		Comparator<AgendaItem> comparator = new AgendaItemComparator();

		Collections.sort(agendaItems, comparator);

		for (AgendaItem agendaItem : agendaItems) {
			System.out.println(agendaItem);
		}
	}
}
