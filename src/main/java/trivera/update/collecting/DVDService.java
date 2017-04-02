package trivera.update.collecting;


import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static trivera.update.collecting.dao.DVDDao.getAllDVDs;

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
public class DVDService {

    public Map<String,Long> getDVDCountByGenre(){
        return getAllDVDs().collect(Collectors.groupingBy(DVD::getGenre,Collectors.counting()));
    }

    public DoubleSummaryStatistics getPriceStats(){
        return getAllDVDs().collect(Collectors.summarizingDouble(DVD::getPrice));
    }

    public List<DVDInfo> getOnSaleDVDInfo(){
//        return getAllDVDs()
//                .collect(Collectors.partitioningBy(DVD::isOnSale))
//                .get(true)
//                .stream()
//                .map(dvd->new DVDInfo(dvd.getTitle(),dvd.getPrice()))
//                .collect(Collectors.toList());

        return getAllDVDs()
                .filter(DVD::isOnSale)
                .map(dvd->new DVDInfo(dvd.getTitle(),dvd.getPrice()))
                .collect(toList());
    }

}
