package trivera.update.lambda.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

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
public class SimpleSwing extends JFrame {

	private void addAction(JButton button) {

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button Clicked");

			}
		});

	}

	public void init() {
		JButton button = new JButton("Push me!");
		addAction(button);
		add(button);
	}

	public static void main(String[] args) {
		SimpleSwing swing = new SimpleSwing();
		swing.init();
		swing.setDefaultCloseOperation(EXIT_ON_CLOSE);
		swing.setTitle("Simple Swing");
		swing.setLocationRelativeTo(null);
		swing.pack();
		swing.setVisible(true);
	}
}
