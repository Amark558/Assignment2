package assignment2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import se.his.it401g.todo.Task;
import se.his.it401g.todo.TaskListener;


public class CustomTask  extends JPanel implements Task  {

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTaskType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTaskListener(TaskListener t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TaskListener getTaskListener() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isComplete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Component getGuiComponent() {
		// TODO Auto-generated method stub
		return null;
	}

}
