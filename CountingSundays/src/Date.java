import java.util.Arrays;

public class Date {
	int day;
	int month;
	int year;
	Day dayName;
	int[] monthDuration = new int[12];
	
	public Date(int day, int month, int year, Day dayName) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.dayName = dayName;
		int februaryNumberOfDays = 28;
		if(isALeapYear(this.year))
			februaryNumberOfDays = 29;
		monthDuration[0] = 31;
		monthDuration[1] = februaryNumberOfDays;
		monthDuration[2] = 31;
		monthDuration[3] = 30;
		monthDuration[4] = 31;
		monthDuration[5] = 30;
		monthDuration[6] = 31;
		monthDuration[7] = 31;
		monthDuration[8] = 30;
		monthDuration[9] = 31;
		monthDuration[10] = 30;
		monthDuration[11] = 31;
	}
	
	public void incDate(){
		if(day == monthDuration[month - 1]){
			day = 1;
			if(month == 12){
				month = 1;
				year++;
				monthDuration[1] = 28;
				if(isALeapYear(year))
					monthDuration[1] = 29;
			} else {
				month += 1;
			}
		} else {
			day += 1;
		}
		dayName = Day.values()[(dayName.ordinal() + 1) % Day.LAST.ordinal()];
	}
	
	public static boolean isALeapYear(int year){
		return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
	}
	
	public boolean isASundayInTheFirstOfTheMonth(){
		return day == 1 && dayName == Day.SUNDAY;
	}
	
	public boolean lowerOrEquals(Date d){
		return this.year < d.year || (this.year == d.year && this.month < d.month) || (this.year == d.year && this.month == d.month && this.day <= d.day);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + ((dayName == null) ? 0 : dayName.hashCode());
		result = prime * result + month;
		result = prime * result + Arrays.hashCode(monthDuration);
		result = prime * result + year;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (dayName != other.dayName)
			return false;
		if (month != other.month)
			return false;
		if (!Arrays.equals(monthDuration, other.monthDuration))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + ", dayName=" + dayName + "]";
	}
}
