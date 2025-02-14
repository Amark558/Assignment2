package assignment2;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.*;

import se.his.it401g.todo.HomeTask;
import se.his.it401g.todo.Task;

public class ToDo  {
	


	public static void main(String[] args) {

		ToDo application = new ToDo();

		application.execute();
		JFrame frame = new JFrame();

		Task task = new HomeTask();
		JPanel buttonPanel = new JPanel();
		

		frame.add(task.getGuiComponent());// Adds the GUI components for the HomeTask

		JButton studyTaskButton = new JButton("Add Study Task");
		JButton editButton = new JButton("Edit");
		JButton homeButton = new JButton("Add Home Task");
		JButton customButton = new JButton("Add Custom Task");
		
		JLabel taskLabel = new JLabel("Tasks | Completed Tasks: " );

		buttonPanel.add(studyTaskButton);
		buttonPanel.add(homeButton);
		buttonPanel.add(customButton);
		buttonPanel.add(editButton);
		
		
		frame.add(buttonPanel,BorderLayout.NORTH);
		frame.add(taskLabel, BorderLayout.SOUTH);

		frame.setBounds(100, 100, 400, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void execute() {

	}

}
