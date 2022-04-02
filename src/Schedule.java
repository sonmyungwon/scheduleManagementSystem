
public class Schedule {
	int CNum;
	String Name;
	String Date;
	String Place;
	String With;
	String Pnum;
	public Schedule(){
	}
	public Schedule(int CNum, String Name,String Date,String Place) {
		this.CNum=CNum;
		this.Name= Name;
		this.Date=Date;
		this.Place =Place;
	}
	public Schedule(int CNum, String Name,String Date,String Place,	String With, String Pnum) {
		this.CNum=CNum;
		this.Name= Name;
		this.Date=Date;
		this.Place =Place;
		this.With= With;
		this.Pnum= Pnum;
	}
	public void PrintInfo() {
		System.out.println("Count Number:  "+ CNum +"  Schedule Name:  " + Name +"  Schedule Date:  "+ Date);
		System.out.println("  Schedule Place:  "+ Place + "  With whom:  "+ With + "  Connect Phone Number:  " +Pnum);
	}
}
