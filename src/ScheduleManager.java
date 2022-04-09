
import java.util.ArrayList;
import java.util.Scanner;

import Schedule.Highschedule;
import Schedule.Schedule;

public class ScheduleManager {
	ArrayList<Schedule> schedules =new ArrayList<Schedule>();
	Scanner input;

	public ScheduleManager(Scanner input) {
		this.input=input;
	}
	public void addschedule() {
		int im=0;
		Schedule schedule = new Schedule();
		while(im !=1 && im !=2) {
			System.out.println("1. high");
			System.out.println("2. low");
			System.out.print("select num 1 or 2 : ");
			im =input.nextInt();
			if(im==1) {
				schedule = new Highschedule();
				schedule.getUserInput(input);
				schedules.add(schedule);
			}else if(im==2) {
				schedule = new Schedule();
				schedule.getUserInput(input);
				schedules.add(schedule);
			}else {
				System.out.print("select num 1 or 2");
			}
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
			Schedule schedule =schedules.get(i);
			if(schedule.getDate()==scheduleid) {
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
						schedule.setDate(Date);
						break;
					case 2:
						String Name = input.next();
						schedule.setName(Name);
						break;
					case 3:
						String Place = input.next();
						schedule.setPlace(Place);
						break;
					case 4:
						String With = input.next();
						schedule.setWith(With);
						break;
					case 5:
						String Pnum = input.next();
						schedule.setPnum(Pnum);
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
