package trivera.update.js;

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
public class Client {

	public static void main(String[] args) {

		String[] testEmails = { "sample@google.nl", "my.name@google.co.uk",
				"wrongEmail" };

		for (String email : testEmails) {

			System.out.println(String.format("%s is %s", email,
					ValidationService.validateEmail(email) ? "valid"
							: "not valid"));
		}

	}
}
