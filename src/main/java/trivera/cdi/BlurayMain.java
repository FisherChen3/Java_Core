package trivera.cdi;

import trivera.cdi.util.BeanManagerUtil;

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
public class BlurayMain {
	private static BeanManagerUtil beanManager = BeanManagerUtil.getInstance();
	
	public static void main(String[] args) {
	 
		BlurayManager manager = beanManager.getBean(BlurayManager.class);
		Bluray bluray = new Bluray();
		bluray.setId("258540");
		bluray.setTitle("Rio");
		bluray.setStudio("Fox");
		bluray.setPrice(19.99);
		bluray.setRating("G");
		bluray.setGenre("Animation");

        manager.addBluray(bluray);
	}

}
