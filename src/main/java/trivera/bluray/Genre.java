package trivera.bluray;

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
public enum Genre {
	WAR("War"), ADVENTURE("Adventure"), DRAMA("Drama"), SILENT("Silent"), WESTERN(
			"Western"), DOCUMENTARY("Documentary"), MYSTERY("Mystery"), SUSPENSE(
			"Suspense"), ANIME("Anime"), EXERCISE("Exercise"), THRILLER(
			"Thriller"), COMEDY("Comedy"), SCIFI("SciFi"), MUSICAL("Musical"), ACTION(
			"Action"), SPORTS("Sports"), FOREIGN("Foreign"), HORROR("Horror"), BALLET(
			"Ballet"), DANCE("Dance"), MUSIC("Music"), GAMES("Games"), FANTASY(
			"Fantasy"), ANIMATION("Animation"), FAMILY("Family"), SATIRE(
			"Satire"), TV_CLASSICS("TV Classics"), OPERA("Opera");

	private String description;

	private Genre(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}
}

