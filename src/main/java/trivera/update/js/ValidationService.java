package trivera.update.js;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.InputStream;
import java.io.InputStreamReader;

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
public class ValidationService {

	public static boolean validateEmail(String email) {

		try {
			// Get an instance of the ScriptEngineManager
			ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
			// Get the Nashorn scriptengine
			ScriptEngine scriptEngine = scriptEngineManager
					.getEngineByName("Nashorn");

			InputStream resource = ValidationService.class
					.getClassLoader().getResourceAsStream("Validation.js");

			// evaluate the Validation resource
			scriptEngine.eval(new InputStreamReader(resource));

			// Get the Validator for validation of emails
			Validator validator = (Validator) scriptEngine
					.get("emailValidator");

			// validate the email and return the result
			return validator.validate(email);
		} catch (ScriptException e) {
			throw new RuntimeException(e);
		}
	}
}
