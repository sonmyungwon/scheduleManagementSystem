package Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import ScheduleManagement.ScheduleManager;
import gui.ScheduleViewer;
import gui.WindowsFrame;

public class ButtonViewListener implements ActionListener {
	WindowsFrame frame;

	public ButtonViewListener(WindowsFrame frame) {
		this.frame= frame;
	}

	public void actionPerformed(ActionEvent e) {
		ScheduleViewer scheduleviewer = frame.getScheduleviewer();
		ScheduleManager schedulemanager = getobject("schedulemanager.ser");
		scheduleviewer.setSchedulemanger(schedulemanager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(scheduleviewer);
		frame.revalidate();
		frame.repaint();
	}
	
	public static ScheduleManager getobject(String filename) {
		ScheduleManager schedulemanager=null;

		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			schedulemanager= (ScheduleManager)in.readObject();

			in.close();
			file.close();

		} catch (FileNotFoundException e) {
			return schedulemanager;
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} 
		return schedulemanager;
	}
}
