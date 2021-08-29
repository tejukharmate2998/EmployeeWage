  public class EmpWageBuilderUC2 {
	
        //class members(constant)
    	public static void main(String[] args) {
    	int IS_FULL_TIME = 1;
    	int EMP_RATE_PER_HOUR = 20;
    	
    	//variables
    	int empHours = 0;
    	int empWage =0;
    	
    	//computation
    	double empCheck = (int)Math.floor(Math.random()*10 %2);
    	if(empCheck == IS_FULL_TIME)
    		empHours = 8;
    	empWage = EMP_RATE_PER_HOUR * empHours;
    	System.out.println("Employee Wage:"+empWage);
    	}
}
