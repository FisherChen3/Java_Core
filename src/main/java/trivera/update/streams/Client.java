package trivera.update.streams;

import java.util.List;
import java.util.Optional;

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
public class Client {

	public static void main(String[] args) {
		Client client = new Client();
		client.client();

	}

	public void client() {
		DVDService service = new DVDService();

		System.out.printf("Number of DVDs %d%n", service.getDVDCount());

		System.out.println("Genres: ");
		for (String genre : service.getGenres()) {
			System.out.printf("     %s%n", genre);
		}

		System.out.printf("Minimum Price: %.2f%n", service.getMinimumPrice());

		List<DVD> byStudio = service.getDVDsByStudio("MGM/UA");
		System.out.printf("Number of DVDs found for studio: %d%n", byStudio.size());

		Optional<DVD> madMax = service.findDVDByTitle("Mad Max");

		madMax.ifPresent(dvd -> System.out.println("Found Mad Max"));
	}

}
