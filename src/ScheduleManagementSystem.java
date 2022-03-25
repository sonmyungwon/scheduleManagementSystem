import java.util.Scanner;

public class ScheduleManagementSystem {
	public static void main (String args[]) {
		int com = 0;
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
				addschedule();
				break;
			case 2:
				delateschedule();
				break;
			case 3:
				editschedule();
				break;
			case 4:
				viewschedule();
				break;
			case 5:
				break;
			case 6:
				break;

			}
		}
	}
	public static void addschedule() {
		Scanner input= new Scanner(System.in);
		System.out.print("schedule name: ");		
		String scheduleName = input.next();
		System.out.print("schedule date: ");
		String scheduleDate = input.next();
		System.out.print("meeting place: ");
		String place = input.next();
		System.out.print("With whom: ");
		String friend = input.next();
		System.out.print("contact number: ");
		String pnum = input.next();
	}
	public static void delateschedule() {		
		Scanner input= new Scanner(System.in);
		System.out.print("schedule name: ");		
		String scheduleName = input.next();
	}
	public static void editschedule() {		
		Scanner input= new Scanner(System.in);
		System.out.print("schedule name: ");		
		String scheduleName = input.next();
	}
	public static void viewschedule() {
		Scanner input= new Scanner(System.in);
		System.out.print("schedule name: ");		
		String scheduleName = input.next();
	}
}
