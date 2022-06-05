package Schedule;

import java.util.Scanner;

import exception.PhoneFormatException;

public interface ScheduleInput {

	void getUserInput(Scanner input);

	int getDate();
	
	int getName();
	
	int getPlace();
	
	int getWith();
	
	int getPnum();
	
	void setDate(int date);

	void setName(String name);

	void setPlace(String place);

	void setWith(String with);

	void setPnum(String pnum) throws PhoneFormatException;

	void printInfo();
	
	void setScheduleDate( Scanner input );
	
	void setScheduleName( Scanner input );
	
	void setSchedulePlace( Scanner input );
	
	void setScheduleWith( Scanner input );
	
	void setSchedulePnum( Scanner input );
}
