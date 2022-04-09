package Schedule;

import java.util.Scanner;

public class Highschedule extends Schedule {

	public void getUserInput(Scanner input){
		System.out.println("ex 220324");
		System.out.print("schedule date : ");
		int Date = input.nextInt();
		this.setDate(Date);

		System.out.print("schedule name: ");		
		String Name = input.next();
		this.setName(Name);

		char answer='x';
		while(answer!='y' &&answer!='Y' &&answer!='n' &&answer!='N' ) {
			System.out.print("Is the exact location determined(Y/n)?:");
			answer =input.next().charAt(0);
			if(answer=='y'|| answer =='Y') {
				System.out.print("meeting place: ");
				String Place = input.next();
				this.setPlace(Place);
				break;
			}else if(answer=='n'|| answer =='N') {
				this.setPlace("");
				break;
			}
		}
		System.out.print("With whom: ");
		String With = input.next();
		this.setWith(With);

		System.out.print("contact number: ");
		String Pnum = input.next();
		this.setPnum(Pnum); 
	}

}
