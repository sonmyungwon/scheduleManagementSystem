package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ScheduleAdder extends JPanel{
	WindowsFrame frame;

	public ScheduleAdder(WindowsFrame frame){
		this.frame = frame;

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
		panel.add(labelPnum);
		panel.add(fieldPnum);

		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));

		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);


		this.add(panel);
		this.setVisible(true);
	}

}
