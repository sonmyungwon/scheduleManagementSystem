import java.util.Scanner;

public class ScheduleManagementSystem {
	public static void main (String args[]) {
		int com = 0;
		String scheduleName = null;
		String scheduleDate= null;
		String place= null;
		String friend= null;
		String pnum= null;
		Scanner input= new Scanner(System.in);
		while(com!=6){
		System.out.println("1. Add Schedule");
		System.out.println("2. Delate Schedule");
		System.out.println("3. Edit Schedule");
		System.out.println("4. View Schedule");
		System.out.println("5. show a menu");
		System.out.println("6. Exit");
		System.out.print("Please enter a number:");
		com = input.nextInt();
		switch(com) {
		case 1 : 		
			System.out.println("schedule name: ");		
			scheduleName = input.next();
			System.out.println("schedule date: ");
			scheduleDate = input.next();
			System.out.println("meeting place: ");
			place = input.next();
			System.out.println("With whom: ");
			friend = input.next();
			System.out.println("contact number: ");
			pnum = input.next();
			break;
		
		case 2:
			scheduleName="";
			scheduleDate="";
			place="";
			friend="";
			pnum="";
			break;
		case 3:
			System.out.println("schedule name: "+scheduleName);		
			scheduleName = input.next();
			System.out.println("schedule date: "+scheduleDate);
			scheduleDate = input.next();
			System.out.println("meeting place: "+ place);
			place = input.next();
			System.out.println("With whom: "+friend);
			friend = input.next();
			System.out.println("contact number: "+pnum);
			pnum = input.next();
			break;
		case 4:
			System.out.println("schedule name:  " + scheduleName);		
			System.out.println("schedule date:  " + scheduleDate);
			System.out.println("meeting place:  " + place);
			System.out.println("With whom:  " + friend);
			System.out.println("contact number:  " + pnum);
		
			}
		}
	}
	
}