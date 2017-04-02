package trivera.update.collecting;


import java.util.DoubleSummaryStatistics;
import java.util.Map;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera Technologies
 * <p>
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of the Trivera
 * Group, Inc.
 * <p>
 * Copyright (c) 2017 Trivera Technologies, LLC. http://www.triveratech.com
 * <p>
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

        Map<String, Long> genreStats = service.getDVDCountByGenre();
        for (String key : genreStats.keySet()) {
            System.out.println(key + " : \t" + genreStats.get(key));
        }

        System.out.println("-------------Pricing Stats---------------");
        DoubleSummaryStatistics stats = service.getPriceStats();
        System.out.println("Average price: " + stats.getAverage());
        System.out.println("Max price: " + stats.getMax());
        System.out.println("Min price: " + stats.getMin());

        System.out.println("-------------On Sale---------------------");
        service.getOnSaleDVDInfo().forEach(d-> System.out.println(d.getName() + " $"+d.getPrice()));

    }
}
