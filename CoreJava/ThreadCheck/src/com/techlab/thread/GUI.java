package com.techlab.thread;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI {

	public static void main(String[] args) {
		Control control = new Control();
		JFrame frame = new JFrame();

		JButton syncButtton = new JButton("Sync Time");
		JButton asyncButtton = new JButton("Async Time");
		JButton normalButtton = new JButton("Hello World");
		
		frame.setLayout(new GridLayout(3, 1));

		frame.add(syncButtton);
//		syncButtton.setBounds(10, 10, 100, 30);
		frame.add(asyncButtton);
//		asyncButtton.setBounds(110, 20, 100, 30);
		frame.add(normalButtton);
//		normalButtton.setBounds(210, 30, 10, 30);

		syncButtton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				control.syncTask();
			}
		});
		asyncButtton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				control.start();
			}
		});

		normalButtton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				control.helloWorld();
			}
		});

		frame.setSize(500, 500);
		frame.setVisible(true);
	}

}
