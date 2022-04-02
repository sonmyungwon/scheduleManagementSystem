import java.util.Scanner;

public class ScheduleManager {
	Schedule schedule = new Schedule();
 	 Scanner input;
	
	ScheduleManager(Scanner input) {
			this.input=input;
	}
	public void addschedule() {
		System.out.print("id number: ");		
		schedule.CNum = input.nextInt();
		System.out.print("schedule name: ");		
		schedule.Name = input.next();
		System.out.print("schedule date: ");
		schedule.Date = input.next();
		System.out.print("meeting place: ");
		schedule.Place = input.next();
		System.out.print("With whom: ");
		schedule.With = input.next();
		System.out.print("contact number: ");
		schedule.Pnum = input.next();
	}
	
	public void delateschedule() {		
		System.out.print("id number: ");		
		int scheduleid = input.nextInt();
		if(schedule==null) {
			System.out.println("not resisted");
			return;
		}if(schedule.CNum==scheduleid) {
			schedule=null;
			System.out.println("delated");
		}
	}
	public void editschedule() {		
		System.out.print("id number: ");		
		int scheduleid = input.nextInt();
		if(schedule.CNum==scheduleid) {
			System.out.println("edited:"+ scheduleid);
			}
	}
	public void viewschedule() {
		System.out.print("id number: ");		
		int scheduleid = input.nextInt();
		if(schedule.CNum==scheduleid) {
		schedule.PrintInfo();
		}
		else {
			System.out.println("Enter another ID");
		}
	}
}
