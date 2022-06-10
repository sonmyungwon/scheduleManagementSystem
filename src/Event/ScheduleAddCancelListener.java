package Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.WindowsFrame;

public class ScheduleAddCancelListener implements ActionListener {

	WindowsFrame frame ;

	public ScheduleAddCancelListener(WindowsFrame frame) {	
		this.frame= frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}

}
