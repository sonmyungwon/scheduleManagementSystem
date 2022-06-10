package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ScheduleManagement.ScheduleManager;

public class WindowsFrame extends JFrame {
	
	MenuSelection menuselection ;
	ScheduleAdder scheduleAdder ;
	ScheduleViewer scheduleviewer;
	ScheduleManager schedulemanager;

	public WindowsFrame(ScheduleManager schedulemanager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");

		this.schedulemanager=schedulemanager;
		menuselection =new MenuSelection(this);
		scheduleAdder = new ScheduleAdder(this, this.schedulemanager);
		scheduleviewer = new ScheduleViewer(this,this.schedulemanager);

		this.setupPanel(menuselection);
		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();;
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();

	}

	public MenuSelection getMenuselection() {
		return menuselection;
	}
	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}
	public ScheduleAdder getScheduleAdder() {
		return scheduleAdder;
	}
	public void setScheduleAdder(ScheduleAdder scheduleAdder) {
		this.scheduleAdder = scheduleAdder;
	}
	public ScheduleViewer getScheduleviewer() {
		return scheduleviewer;
	}
	public void setScheduleviewer(ScheduleViewer scheduleviewer) {
		this.scheduleviewer = scheduleviewer;
	}

}

