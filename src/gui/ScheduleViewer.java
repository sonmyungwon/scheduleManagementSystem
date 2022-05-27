package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ScheduleViewer extends JFrame {
	
	public ScheduleViewer() {
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("DATE");
		model.addColumn("NAME");
		model.addColumn("Place");
		model.addColumn("With");
		model.addColumn("Phone number");
		JTable table =new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
}
