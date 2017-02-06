package testjava2;
import testjava.Employee;

public class Employee2 {
	
	
	public static void main(String args[]){
		Employee empOne = new Employee("R1");
		Employee empTwo = new Employee("R2");
		
		empOne.empAge(10);
		empOne.empDesignation("高级");
		empOne.empSalary(1000);		
		empOne.printEmployee();
		
		empTwo.empAge(5);
		empTwo.empDesignation("初级");
		empTwo.empSalary(500);		
		empTwo.printEmployee();
		
		System.out.println("-----------------------------------------------");
		System.out.println("Starting with " + Employee2.getCount());
		
		for ( int i=0;i<500;++i){
			new Employee2();
		}
		
		System.out.println("Created" + Employee2.getCount() + " end");
		
		System.out.println("-----------------------------------------------");
		
	    Integer y = new Integer (5);
	    double a= -100;
	    System.out.println(Math.abs(a));
        //y =  y + 10;
	    
        System.out.println(y);
	}
	
	private static int numInstances =0;
	
	protected static int  getCount(){
		return numInstances;
	}
	private static void addInstance(){
		numInstances++;
	}
	Employee2(){
		Employee2.addInstance();
	}
	
}
