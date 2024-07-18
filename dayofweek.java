package ninjas;
public class DayOfweek {
	public static String dayofweek(int day,int month,int year)
	{
		if(month<5)
		{
			month=month+12;
			year--;
		}
		int k=year%100;
		int j=year/100;
		int dayy=(day+13*(month+1)/5+k+k/4+j/4+5*j)%7;
		switch(dayy)
		{
		case 0: 
			return"Saturday";
		case 1:
			return"Sunday";
		case 2:
			return "Monday";
		case 3:
			return "Tuesday";
		case 4:
			return "Wednesday";
		case 5:
			return "Thursday";
		case 6:
			return "Friday";
			default:
				return "invalid";
		}
	}
	public static void main(String[] args) {
		String c=DayOfweek.dayofweek(18,7,2024);
		System.out.println(c);
		
	}

}
