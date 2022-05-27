package Schedule;

import java.util.Scanner;

import exception.PhoneFormatException;

public class LowSchedule extends Schedule{
	protected String expecteddate;
	public LowSchedule(){
		
	}
	public LowSchedule(Importance imp) {
		this.imp= imp;
	}
	public String getExpecteddate() {
		return expecteddate;
	}
	public void setExpecteddate(String expecteddate) {
		this.expecteddate = expecteddate;
	}
	
	public void printInfo() {
		String simp=getInportnace();
		System.out.println("inportance : "+ simp +"  Schedule Date:  "+ Date +"  Schedule Name:  " + Name +"  Expected Date : "+expecteddate+ "  Schedule Place:  "+ Place + "  With whom:  "+ With + "  Connect Phone Number:  " +Pnum);
	}
	

	public void getUserInput(Scanner input){
		setScheduleDate(input);
		setScheduleName(input);
		checkexpecteddate(input);
		setSchedulePlace(input);
		setScheduleWith(input);
		checkexpectedPnum(input);
	}
	
	public void checkexpectedPnum(Scanner input) {
		char answer='x';
		while(answer!='y' &&answer!='Y' &&answer!='n' &&answer!='N' ) {
			System.out.print("connect number?(Y/n)?:");
			answer =input.next().charAt(0);
			try {
				if(answer=='y'|| answer =='Y') {
					System.out.print("phone number :");
					String pnum = input.next();

					this.setPnum(pnum);

					break;
				}else if(answer=='n'|| answer =='N') {
					this.setPnum("");
					break;
				}else {
				}
			}catch (PhoneFormatException e) {
				System.out.println("Incorrect Phone Foramt. put the Phone number that contains 010 ");

			}
		}
	}

	public void checkexpecteddate(Scanner input) {
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
	}
}


