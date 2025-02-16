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

public class CustomTask extends JPanel implements Task {

	// Editable text feild
	private JTextField text;

	//Non editable text feild
	private JLabel textLabel;

	// Check box for task completion
	JCheckBox completed = new JCheckBox();

	// listeer that reports changes in the main method
	private TaskListener listener;

	
	public CustomTask() {
		super(new BorderLayout());
		this.text = new JTextField("New Custom task",20);
		this.textLabel = new JLabel();
		this.textLabel.setVisible(false);
		JPanel center = new JPanel();
		center.add(text);
		center.add(textLabel);
		add(center);
		
		TaskInputListener inputListener = new TaskInputListener(this, text, textLabel);
		this.text.addKeyListener(inputListener);
		this.textLabel.addMouseListener(inputListener);
		
		JButton remove = new JButton("Remove");
		add(remove,BorderLayout.EAST);
		remove.addActionListener(inputListener);
		
		add(completed,BorderLayout.WEST);
		completed.addItemListener(inputListener);
		
		setMaximumSize(new Dimension(1000,50));
		setBorder(new TitledBorder(getTaskType()));
		
	}

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
