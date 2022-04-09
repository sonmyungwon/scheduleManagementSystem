
import java.util.Scanner;

public class MenuManagement {
	public static void main (String args[]) {
		Scanner input= new Scanner(System.in);
		ScheduleManager schedulemanager = new ScheduleManager(input);

		int com = -1;

		while(com!=5){
			System.out.println("1. Add Schedule");
			System.out.println("2. Delate Schedule");
			System.out.println("3. Edit Schedule");
			System.out.println("4. View Schedules");
			System.out.println("5. Exit");
			System.out.print("Please enter a number:");
			com = input.nextInt();
			switch(com) {
			case 1 : 		
				schedulemanager.addschedule();
				break;
			case 2:
				schedulemanager.delateschedule();
				break;
			case 3:
				schedulemanager.editschedule();
				break;
			case 4:
				schedulemanager.viewchedules();
				break;
			case 5:
				break;
			}
		}
	}
}
