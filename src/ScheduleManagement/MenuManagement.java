package ScheduleManagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import Log.EventLogger;
import gui.WindowsFrame;

public class MenuManagement {
	static EventLogger Logger = new EventLogger("log.txt");

	public static void main (String args[]) {
		Scanner input= new Scanner(System.in);
		ScheduleManager schedulemanager = getobject("Schedulemanager.ser");
		if(schedulemanager==null) {
			schedulemanager = new ScheduleManager(input);
		}
		
		WindowsFrame frame = new WindowsFrame(schedulemanager);
		selectMenu(input ,schedulemanager);
		putObject(schedulemanager,"Schedulemanager.ser");
	}
	public static void selectMenu(Scanner input,ScheduleManager schedulemanager) {
		int com = -1;
		while(com!=5){
			try {
				showMenu(); 
				com = input.nextInt();
				switch(com) {
				case 1 : 		
					schedulemanager.addschedule();
					Logger.log("Add Schedule");
					break;
				case 2:
					schedulemanager.delateschedule();
					Logger.log("Delate Schedule");
					break;
				case 3:
					schedulemanager.editschedule();
					Logger.log("Edit Schedule");
					break;
				case 4:
					schedulemanager.viewchedules();
					Logger.log("View Schedules");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("please put an integer between 1 and 5 !");
				if(input.hasNext()) {
					input.next();
				}
				com = -1;				
			}
		}
	}
	public static void showMenu() {
		System.out.println("1. Add Schedule");
		System.out.println("2. Delate Schedule");
		System.out.println("3. Edit Schedule");
		System.out.println("4. View Schedules");
		System.out.println("5. Exit");
		System.out.print("Please enter a number:");
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
