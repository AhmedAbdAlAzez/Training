package basics;

public class SalaryCalculator {
	public static void main(String[]args)
	{

	String career="";
	System.out.println("Starting the program");
	career= "Software Developer";
	System.out.println("My career is "+ career);
	int noOfWeeks=20;
	int noOfWorkingHours=10;
	int noOfWorkingDays=5;
	int hoursRate=20;
	double salary= noOfWeeks*noOfWorkingDays*noOfWorkingHours*hoursRate;
	
	System.out.println("My salary is "+ salary+"$");
	
}
}