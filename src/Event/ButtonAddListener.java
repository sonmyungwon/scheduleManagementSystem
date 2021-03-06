package Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import gui.ScheduleAdder;
import gui.WindowsFrame;

public class ButtonAddListener implements ActionListener {
	WindowsFrame frame;
	
	public ButtonAddListener(WindowsFrame frame) {
		this.frame= frame;
	}
	
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getScheduleAdder());
		frame.revalidate();
		frame.repaint();
	}
}
