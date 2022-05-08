package Schedule;

import java.util.Scanner;

public interface ScheduleInput {

	void getUserInput(Scanner input);

	int getDate();

	void setDate(int date);

	void setName(String name);

	void setPlace(String place);

	void setWith(String with);

	void setPnum(String pnum);

	void printInfo();

}
