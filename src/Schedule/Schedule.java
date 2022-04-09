package Schedule;

import java.util.Scanner;

public class Schedule {
	protected Importance imp= Importance.Low;
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
	public void chedule(int Date, String Name,String Place,String With, String Pnum) {
		this.Date=Date;
		this.Name= Name;
		this.Place =Place;
		this.With= With;
		this.Pnum= Pnum;
	}
	public void printInfo() {
		System.out.println("  Schedule Date:  "+ Date +"  Schedule Name:  " + Name + "  Schedule Place:  "+ Place + "  With whom:  "+ With + "  Connect Phone Number:  " +Pnum);
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
	public void setPnum(String pnum) {
		Pnum = pnum;
	}
	public void getUserInput(Scanner input){
		System.out.println("ex 220324");
		System.out.print("schedule date : ");
		int Date = input.nextInt();
		this.setDate(Date);

		System.out.print("schedule name: ");		
		String Name = input.next();
		this.setName(Name);

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