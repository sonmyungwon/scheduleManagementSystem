package Schedule;

import java.util.Scanner;

public class Highschedule extends Schedule{
	Importance imp=Importance.High ;
	
	Highschedule(Importance imp){
		this.imp=imp;
	}
	public void getUserInput(Scanner input){
		setScheduleDate(input);
		setScheduleName(input);
		checkPlace(input);
		setScheduleWith(input);
		setSchedulePnum(input);
	}
	
	public void checkPlace(Scanner input) {
		char answer='x';
		while(answer!='y' &&answer!='Y' &&answer!='n' &&answer!='N' ) {
			System.out.print("Is the exact location determined(Y/n)?:");
			answer =input.next().charAt(0);
			if(answer=='y'|| answer =='Y') {
				setSchedulePlace(input);
				break;
			}else if(answer=='n'|| answer =='N') {
				this.setPlace("");
				break;
			}
		}
	}
	
	public void printInfo() {
		String simp=getInportnace();
		System.out.println("inportance : "+ simp +"  Schedule Date:  "+ Date +"  Schedule Name:  " + Name + "  Schedule Place:  "+ Place + "  With whom:  "+ With + "  Connect Phone Number:  " +Pnum);
	}


}
