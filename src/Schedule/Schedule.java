package Schedule;

import java.util.Scanner;

public abstract class Schedule {
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
	
}
