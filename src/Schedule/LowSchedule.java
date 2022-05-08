package Schedule;

import java.util.Scanner;

public class LowSchedule extends Schedule implements ScheduleInput{
	protected String expecteddate;
	public LowSchedule(){
		
	}
	public String getExpecteddate() {
		return expecteddate;
	}
	public void setExpecteddate(String expecteddate) {
		this.expecteddate = expecteddate;
	}
	public void printInfo() {
		String simp="none";
		switch(this.imp){
		case High:
			simp="High";
			break;
		case Low:
			simp="Low";
			break;
		case Deadline:
			simp="deadline";
			break;
		}
		System.out.println("inportance : "+ simp +"  Schedule Date:  "+ Date +"  Schedule Name:  " + Name +"  Expected Date : "+expecteddate+ "  Schedule Place:  "+ Place + "  With whom:  "+ With + "  Connect Phone Number:  " +Pnum);
	}
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
			System.out.print("Is the exact date not set?(Y/n)?:");
			answer =input.next().charAt(0);
			if(answer=='y'|| answer =='Y') {
				System.out.print("expected date :");
				String expecteddate = input.next();
				this.setExpecteddate(expecteddate);
				break;
			}else if(answer=='n'|| answer =='N') {
				this.setExpecteddate("");
				break;
			}
		}
		System.out.print("meeting place: ");
		String Place = input.next();
		this.setPlace(Place);
		System.out.print("With whom: ");
		String With = input.next();
		this.setWith(With);

		System.out.print("contact number: ");
		String Pnum = input.next();
		this.setPnum(Pnum); 
	}

}
