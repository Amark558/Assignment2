package assignment2;
import javax.swing.JFrame;
import se.his.it401g.todo.*;

public class ToDo {
	

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		Task task = new HomeTask();
		Task taskStudy = new StudyTask();
		System.out.println("Hello World")
		
		frame.add(taskStudy.getGuiComponent());
		frame.add(task.getGuiComponent());
		
		
		frame.setBounds(100, 100, 400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
