public class SwitchWithoutDefault
{
	public static void main(String... args)
	{
		int day = 4;
		String dayName = null;

		switch(day)
		{
			case 0:
				dayName = "Sunday";
				break;
			case 1:
				dayName = "Monday";
				break;
			case 2:
				dayName = "Tuesday";
				break;
			case 3:
				dayName = "Wednesday";
				break;
			case 4:
				dayName = "Thrusday";
				break;
			case 5:
				dayName = "Friday";
				break;
			case 6:
				dayName = "Saturday";
				break;
		}

		System.out.println("Day is : " + dayName);
	}
}
