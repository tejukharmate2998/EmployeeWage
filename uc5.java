public class EmpWageBuilderUC5 {
	
	//class members(constant)
	public static final int IS_FULL_TIME = 1; 
	public static  final int IS_PART_TIME = 2;
	public static  final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;

	public static void main(String[] args) {
		
	//variables
    	int empHours = 0;
    	int empWage =0;
    	int totalEmpWage = 0;
    	
    //computation
    	
    for (int day =0;day<NUM_OF_WORKING_DAYS;day++) {
    	int empCheck = (int)Math.floor(Math.random()*10 ) %3;	
    switch (empCheck)  {
    	   case  IS_FULL_TIME :
    	   empHours = 8;
    break;
    	   case IS_PART_TIME :
    	     empHours = 4;
    	break;
    default:
    	 }
    	empWage =  empHours * EMP_RATE_PER_HOUR;
    	totalEmpWage += empWage;
    	    System.out.println("Employee Wages:"+empWage);
    	}
    	    System.out.println("Total Emp Wage:"+ totalEmpWage);
	}
}
