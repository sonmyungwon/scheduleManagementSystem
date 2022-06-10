package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Event.ScheduleAddCancelListener;
import Event.ScheduleAdderListener;
import ScheduleManagement.ScheduleManager;

public class ScheduleAdder extends JPanel{
	WindowsFrame frame;
	ScheduleManager schedulemanager;

	public ScheduleAdder(WindowsFrame frame, ScheduleManager schedulemanager){
		this.frame = frame;
		this.schedulemanager= schedulemanager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

		JLabel labelDate = new JLabel("ID: ",JLabel.TRAILING);
		JTextField fieldDate = new JTextField(10);
		labelDate.setLabelFor(fieldDate);
		panel.add(labelDate);
		panel.add(fieldDate);

		JLabel labelName = new JLabel("Name: ",JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);

		JLabel labelPlace = new JLabel("Place: ",JLabel.TRAILING);
		JTextField fieldPlace = new JTextField(10);
		labelPlace.setLabelFor(fieldPlace);
		panel.add(labelPlace);
		panel.add(fieldPlace);

		JLabel labelWith = new JLabel("With: ",JLabel.TRAILING);
		JTextField fieldWith = new JTextField(10);
		labelWith.setLabelFor(fieldWith);
		panel.add(labelWith);
		panel.add(fieldWith);

		JLabel labelPnum = new JLabel("Phone number: ",JLabel.TRAILING);
		JTextField fieldPnum = new JTextField(10);
		labelPnum.setLabelFor(fieldPnum);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new ScheduleAdderListener(fieldDate,fieldName, fieldPlace, fieldWith, fieldPnum, schedulemanager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new ScheduleAddCancelListener(frame));
		
		panel.add(labelPnum);
		panel.add(fieldPnum);

		panel.add(saveButton);
		panel.add(cancelButton);

		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);


		this.add(panel);
		this.setVisible(true);
	}

}
