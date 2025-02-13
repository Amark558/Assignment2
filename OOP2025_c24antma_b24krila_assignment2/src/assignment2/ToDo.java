package assignment2;

import javax.swing.JFrame;

import se.his.it401g.todo.*;

public class ToDo {

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		Task task = new HomeTask();

		frame.add(task.getGuiComponent());//Adds the GUI components for the HomeTask

		frame.setBounds(100, 100, 400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
