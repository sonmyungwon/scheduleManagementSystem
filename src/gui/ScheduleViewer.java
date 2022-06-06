package gui;

import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Schedule.ScheduleInput;
import ScheduleManagement.ScheduleManager;


public class ScheduleViewer extends JPanel {
	WindowsFrame frame;
	ScheduleManager schedulemanager;
		
	public ScheduleViewer(WindowsFrame frame, ScheduleManager schedulemanager) {
		this.frame = frame;
		this.schedulemanager = schedulemanager;
		System.out.println("***" + schedulemanager.size()+ "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("DATE");
		model.addColumn("NAME");
		model.addColumn("Place");
		model.addColumn("With");
		model.addColumn("Phone number");
		for(int i = 0; i<schedulemanager.size(); i++) {
			Vector row = new Vector();
			ScheduleInput input = schedulemanager.get(i);
			row.add(input.getDate());

			model.addRow(row);
		}
		
		JTable table =new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
