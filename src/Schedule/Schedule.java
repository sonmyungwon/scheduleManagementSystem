package Schedule;

import java.io.Serializable;
import java.util.Scanner;

import exception.PhoneFormatException;

public abstract class Schedule  implements ScheduleInput,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 138012443816169176L;
	
	protected Importance imp=Importance.Low ;
	protected int Date;
	protected String Name;
	protected String Place;
	protected String With;
	protected String Pnum;

	public Schedule(){
	}
	public Schedule(int Date, String Name,String Place) {
		this.Date=Date;
		this.Name= Name;
		this.Place =Place;
	}
	public Schedule(int Date, String Name,String Place,String With, String Pnum) {
		this.Date=Date;
		this.Name= Name;
		this.Place =Place;
		this.With= With;
		this.Pnum= Pnum;
	}
	public Schedule(Importance imp,int Date, String Name,String Place,String With, String Pnum) {
		this.imp=imp;
		this.Date=Date;
		this.Name= Name;
		this.Place =Place;
		this.With= With;
		this.Pnum= Pnum;
	}
	public abstract void printInfo();

	public String getImportnace() {
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
		default:
		}
		return simp;
	}
	public int getDate() {
		return Date;
	}
	public void setDate(int date) {
		Date = date;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPlace() {
		return Place;
	}
	public void setPlace(String place) {
		Place = place;
	}
	public String getWith() {
		return With;
	}
	public void setWith(String with) {
		With = with;
	}
	public String getPnum() {
		return Pnum;
	}
	public void setPnum(String pnum)throws PhoneFormatException{
		if(!pnum.contains("010")&& !pnum.equals("")){
			throw new PhoneFormatException();
		}
		this.Pnum = pnum;
	}
	public void setScheduleDate( Scanner input ) {
		System.out.println("ex 220324");
		System.out.print("schedule date : ");
		int Date = input.nextInt();
		this.setDate(Date);
	}


	public void setScheduleName( Scanner input ) {
		System.out.print("schedule name: ");	
		String Name = input.next();
		this.setName(Name);
	}


	public void setSchedulePlace( Scanner input ) {
		System.out.print("schedule Place: ");
		String Place = input.next();
		this.setPlace(Place);
	}


	public void setScheduleWith( Scanner input ) {
		System.out.print("schedule With: ");
		String With = input.next();
		this.setWith(With);
	}


	public void setSchedulePnum(Scanner input ) {
		String phone = "";
		while(!phone.contains("010")) {
			System.out.print("schedule phone number: ");
			phone = input.next();
			try {
				this.setPnum(phone);
			}catch(PhoneFormatException e) {
				System.out.println("Incorrect Phone Foramt. put the Phone number that contains 010 ");
			}
		}

	}

}
