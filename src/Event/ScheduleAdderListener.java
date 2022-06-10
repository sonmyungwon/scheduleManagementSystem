package Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Schedule.Highschedule;
import Schedule.Importance;
import Schedule.ScheduleInput;
import ScheduleManagement.ScheduleManager;
import exception.PhoneFormatException;
import gui.WindowsFrame;

public class ScheduleAdderListener implements ActionListener{
	JTextField fieldDate;
	JTextField fieldName;
	JTextField fieldPlace;
	JTextField fieldWith;
	JTextField fieldPnum; 

	ScheduleManager schedulemanager;

	public ScheduleAdderListener(
			JTextField fieldDate, 
			JTextField fieldName, 
			JTextField fieldPlace,
			JTextField fieldWith, 
			JTextField fieldPnum,
			ScheduleManager schedulemanager) 
	{
		this.fieldDate = fieldDate;
		this.fieldName = fieldName;
		this.fieldPlace = fieldPlace;
		this.fieldWith = fieldWith;
		this.fieldPnum = fieldPnum;
		this.schedulemanager =schedulemanager;
	}
	public ScheduleAdderListener(WindowsFrame frame) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		ScheduleInput schedule= new Highschedule(Importance.High);
		try {
			schedule.setDate(Integer.parseInt(fieldDate.getText()));
			schedule.setName(fieldName.getName());
			schedule.setPlace(fieldPlace.getText());
			schedule.setWith(fieldWith.getText());
			schedule.setPnum(fieldPnum.getText());
			schedulemanager.addschedule(schedule);
			putObject(schedulemanager,"Schedulemanager.ser");
			schedule.printInfo();
		} catch (PhoneFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	
	public static void putObject(ScheduleManager schedulemanager, String filename) {
		try {

			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(schedulemanager);

			out.close();
			file.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	

}
