
import java.util.ArrayList;
import java.util.Scanner;

import Schedule.DeadlineSchedule;
import Schedule.Highschedule;
import Schedule.LowSchedule;
import Schedule.Schedule;
import Schedule.ScheduleInput;

public class ScheduleManager {
	ArrayList<ScheduleInput> schedules =new ArrayList<ScheduleInput>();
	Scanner input;

	public ScheduleManager(Scanner input) {
		this.input=input;
	}
	public void addschedule() {
		int im=0;
		ScheduleInput ScheduleInput;
		while(im !=1 && im !=2) {
			System.out.println("1. high");
			System.out.println("2. Low");
			System.out.println("3. Deadline");
			System.out.print("Select num 1,2 or 3 : ");
			im =input.nextInt();
			if(im==1) {
				ScheduleInput = new Highschedule();
				ScheduleInput.getUserInput(input);
				schedules.add(ScheduleInput);
			}else if(im==2) {
				ScheduleInput = new LowSchedule();
				ScheduleInput.getUserInput(input);
				schedules.add(ScheduleInput);
			}else if(im==3) {
				ScheduleInput = new DeadlineSchedule();
				ScheduleInput.getUserInput(input);
				schedules.add(ScheduleInput);
			}
			else {
				System.out.print("select num 1 ,2 or 3");
			}
			break;
		}

	}

	public void delateschedule() {		
		System.out.print("date number: ");		
		int scheduledata = input.nextInt();
		int index= 0;
		for(int i =0; i<=schedules.size();i++) {
			if(schedules.get(i).getDate() == scheduledata ) {
				index= i;
				break;
			}
		}
		if(index>=0) {
			schedules.remove(index);
			System.out.println("the schedule "+scheduledata+" is delated");
		}
		else{System.out.println("not resisted");
		}
	}


	public void editschedule() {
		System.out.print("Date: ");		
		int scheduleid = input.nextInt();
		for(int i =0; i<schedules.size();i++) {
			ScheduleInput ScheduleInput =schedules.get(i);
			if(ScheduleInput.getDate()==scheduleid) {
				int num = 0;
				while(num!=6) {
					System.out.println("schedule Info Edit Menu **");
					System.out.println(" 1. Edit date");
					System.out.println(" 2. Edit Name ");
					System.out.println(" 3. Edit place: ");
					System.out.println(" 4. Edit with whom");
					System.out.println(" 5. Edit contact number ");
					System.out.println(" 6. Exit ");
					System.out.println("Please enter a number:");

					num = input.nextInt();
					if(num==6) {
						break;
					}
					switch(num) {
					case 1 :	
						int Date = input.nextInt();
						ScheduleInput.setDate(Date);
						break;
					case 2:
						String Name = input.next();
						ScheduleInput.setName(Name);
						break;
					case 3:
						String Place = input.next();
						ScheduleInput.setPlace(Place);
						break;
					case 4:
						String With = input.next();
						ScheduleInput.setWith(With);
						break;
					case 5:
						String Pnum = input.next();
						ScheduleInput.setPnum(Pnum);
						break;

					}
				}
			}
		}
	}


	public void viewchedules() {
		//System.out.print("Member ID: ");
		//int memberid = input.nextInt();
		System.out.println("# of registered members: " + schedules.size());
		for(int i =0; i<schedules.size();i++) {
			schedules.get(i).printInfo();

		}
	}
}
