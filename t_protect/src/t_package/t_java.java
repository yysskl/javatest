package t_package;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class t_java {
	private static SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd");
	
	public static void main(String[] args) throws Exception{
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        String befor = dfs.format(cal.getTime());
        System.out.println( befor );
	}
}
