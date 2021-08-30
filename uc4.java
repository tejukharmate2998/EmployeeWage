public class EmpWageBuilderUC4 {
	
	//class constant
      final static int IS_FULL_TIME = 1; 
      final static int IS_PART_TIME = 2;
      final static int EMP_RATE_PER_HOUR = 20;

	public static void main(String[] args) {
		
	// variables
    	int empHours = 0;
    	int empWage =0;
    //computation
    int empCheck = (int)Math.floor(Math.random()*10 ) %3;
    switch (empCheck)  {
    	case  IS_FULL_TIME :
    	empHours = 4;
    break;
    	case IS_PART_TIME :
    	     empHours = 8;
    	     break;
    default:
    		 empHours = 0;
    	}
    	 
    	empWage =  empHours * EMP_RATE_PER_HOUR;
    	   System.out.println("Employee Wage:"+empWage);
    	}
	}
