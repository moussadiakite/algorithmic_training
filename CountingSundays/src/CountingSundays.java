import java.util.HashMap;

public class CountingSundays {
	
	public static int getNumberOfSundays() {
		Date beginningDate = new Date(1, 1, 1901, Day.TUESDAY);
		Date endDate = new Date(31, 12, 2000, Day.SUNDAY);
		Date currentDate = beginningDate;
		int numberOfSundays = 0;
		while(currentDate.lowerOrEquals(endDate)){
			if(currentDate.isASundayInTheFirstOfTheMonth())
				numberOfSundays++;
			currentDate.incDate();
		}
		return numberOfSundays;
	}

}
