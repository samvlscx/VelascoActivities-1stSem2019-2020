public class VariablesAndDataTypes{
	public static void main(String [] args){
		
		String baguio = "The temperature in Baguio City has warmed throughout the years.";
		char a = 'A';
		float degrees1 = 16.0f;
		double degrees2 = 23.5;
		byte hoursADay = 24;
		short daysAWeek = 7;
		int weeksPerMonth = 4;
		long monthsEachYr = 12;
		boolean tf = true;
		
		if(tf){
		System.out.println(baguio + "\n\t" + a + " recent news article stated that the City has been averaging " + degrees1
                        + " degrees celsius at dawn and " + degrees2 + " at noon.\n"
                        + "\t\t Regardless, lowlanders still feel cold " + hoursADay + " hours a day, " + daysAWeek + " days a week " 
                        + weeksPerMonth + " weeks per month " + monthsEachYr + " months each year.");
		}else{
		System.out.println("The boolean was changed to a False value.");
		}
		
	}

}