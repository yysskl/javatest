package testjava;
import testjava.Employee;

import java.text.SimpleDateFormat;
import java.util.*;

public class EmployeeTest {
	private String  name;
	private static List testLs= new ArrayList();
	private static SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd");
	public EmployeeTest(String name){
			this.name = name;
	}
	
	public static void main( String args[]){
			Employee empOne = new Employee("R1");
			
			empOne.empAge(10);
			
			for(int i=0;i<=6;i++){
				testLs.add(i);
			}
			
		Iterator it=testLs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		 Calendar cal = Calendar.getInstance();
		 cal.add(Calendar.DATE, -1);
		 System.out.println(dfs.format(cal.getTime()));

		System.out.println(new Date().getTime());
		
		
		System.out.println("bbaa");
	}
	
	public void Test(){
		
	}
}
