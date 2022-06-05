package Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.ScheduleViewer;
import gui.WindowsFrame;

public class ButtonViewListener implements ActionListener {
	WindowsFrame frame;
	
	public ButtonViewListener(WindowsFrame frame) {
		this.frame= frame;
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton b =(JButton) e.getSource();
		ScheduleViewer viewer = frame.getScheduleviewer();
		frame.setupPanel(viewer);
	}
}
