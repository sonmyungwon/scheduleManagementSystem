package Schedule;

import java.util.Scanner;

public class DeadlineSchedule extends Schedule{
	Importance imp=Importance.Deadline ;
	protected String deadline ;
	public DeadlineSchedule(Importance imp) {
		this.imp=imp;
	}

	public String getdeadline() {
		return deadline;
	}

	public void setdeadline(String deadline) {
		this.deadline = deadline;
	}

	public void setScheduleDeadline(Scanner input ){
		System.out.print("schedule Deadline: ");
		String deadline = input.next();
		this.setdeadline(deadline);
	}


	public void getUserInput(Scanner input){
		setScheduleDate(input);
		setScheduleName(input);
		checkDeadline(input);
		setSchedulePlace(input);
		setScheduleWith(input);
		setSchedulePnum(input);
	}
	
	public void checkDeadline(Scanner input) {
		char answer='x';
		while(answer!='y' &&answer!='Y' &&answer!='n' &&answer!='N' ) {
			System.out.print("Does this schedule have a deadline(Y/n)?:");
			answer =input.next().charAt(0);
			if(answer=='y'|| answer =='Y') {
				setScheduleDeadline(input);
				break;
			}else if(answer=='n'|| answer =='N') {
				this.setdeadline("");
				break;
			}
		}
	}
	public void printInfo() {
		String simp=getImportnace();
		System.out.println("inportance : "+ simp +"  Schedule Date:  "+ Date +"  Schedule Name:  " + Name +"  DeadLine :"+deadline+ "  Schedule Place:  "+ Place + "  With whom:  "+ With + "  Connect Phone Number:  " +Pnum);
	}
}
