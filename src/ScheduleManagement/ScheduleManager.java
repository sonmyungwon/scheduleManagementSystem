package ScheduleManagement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import Schedule.DeadlineSchedule;
import Schedule.Highschedule;
import Schedule.Importance;
import Schedule.LowSchedule;
import Schedule.ScheduleInput;

public class ScheduleManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1906376578871793827L;

	ArrayList<ScheduleInput> schedules =new ArrayList<ScheduleInput>();
	transient Scanner input;

	public ScheduleManager(Scanner input) {
		this.input=input;
	}

	public void addmenu() {
		System.out.println("1. high");
		System.out.println("2. Low");
		System.out.println("3. Deadline");
		System.out.print("Select num 1,2 or 3 : ");
	}
	public void addschedule(int date, String name,String email, String Pnum) {
		ScheduleInput ScheduleInput = new Highschedule(Importance.High);
		ScheduleInput.getUserInput(input);
		schedules.add(ScheduleInput);
	}

	public void addschedule(ScheduleInput ScheduleInput) {
		schedules.add(ScheduleInput);
	}

	public void addschedule() {
		int im=0;
		ScheduleInput ScheduleInput;
		try {
			while(im <1 || im >3) {
				addmenu();
				im =input.nextInt();
				if(im==1) {
					ScheduleInput = new Highschedule(Importance.High);
					ScheduleInput.getUserInput(input);
					schedules.add(ScheduleInput);
				}else if(im==2) {
					ScheduleInput = new LowSchedule(Importance.Low);
					ScheduleInput.getUserInput(input);
					schedules.add(ScheduleInput);
				}else if(im==3) {
					ScheduleInput = new DeadlineSchedule(Importance.Deadline);
					ScheduleInput.getUserInput(input);
					schedules.add(ScheduleInput);
				}
				else {
					System.out.print("select num 1 ,2 or 3");
				}
			}
		}catch(InputMismatchException e) {
			System.out.println("please put an integer between 1 and 5 !");
			if(input.hasNext()) {
				input.next();
			}
			im=-1;
		}

	}


	public void delateschedule() {		
		System.out.print("date number: ");		
		int scheduledata = input.nextInt();
		int index=findIndex(scheduledata);
		removefromSchedule(index,scheduledata);
	}


	public int findIndex(int scheduledate) {
		int index=-1;
		for(int i =0; i<=schedules.size();i++) {
			if(schedules.get(i).getDate() == scheduledate ) {
				index= i;
				break;
			}

		}
		return index;
	}


	public int removefromSchedule(int index, int scheduledate) {
		if(index>=0) {
			schedules.remove(index);
			System.out.println("the schedule "+scheduledate+" is delated");
			return 1;
		}
		else{System.out.println("not resisted");
		return -1;
		}
	}


	public void editschedule() {
		System.out.print("Date: ");		
		int scheduleid = input.nextInt();
		for(int i =0; i<schedules.size();i++) {
			ScheduleInput Schedule =schedules.get(i);
			if(Schedule.getDate()==scheduleid) {
				int num = 0;
				while(num!=6) {
					showEditmenu();
					num = input.nextInt();
					switch(num) {
					case 1 :	
						Schedule.setScheduleDate(input);
						break;
					case 2:
						Schedule.setScheduleName(input);
						break;
					case 3:
						Schedule.setSchedulePlace( input);
						break;
					case 4:
						Schedule.setScheduleWith(input);
						break;
					case 5:
						Schedule.setSchedulePnum(input);
					default:
						continue;
					}
				}
			}
		}
	}


	public void viewchedules() {
		System.out.println("# of registered members: " + schedules.size());
		for(int i =0; i<schedules.size();i++) {
			schedules.get(i).printInfo();

		}
	}	


	public void showEditmenu() {
		System.out.println("schedule Info Edit Menu **");
		System.out.println(" 1. Edit date");
		System.out.println(" 2. Edit Name ");
		System.out.println(" 3. Edit place: ");
		System.out.println(" 4. Edit with whom");
		System.out.println(" 5. Edit contact number ");
		System.out.println(" 6. Exit ");
		System.out.println("Please enter a number:");
	}


	public int size() {
		return schedules.size(); 
	}


	public  ScheduleInput get(int index) { 
		return  schedules.get(index);
	}
}
