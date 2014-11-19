package Lesson5.shop;

import java.util.Calendar;

public class Utils {
	public static int getDay(){
		Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_MONTH);        
        return day;
	}
	
	public static int getMoth(){
		Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        //System.out.println("month is " + month);
        return month + 1;
	}
	
	public static int getYear(){
		Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        //System.out.println("month is " + month);
        return year;
	}
	
	public static boolean checkDaysRestriction(int days, int year1, int month1, int day1){
		 
		  Calendar calendar1 = Calendar.getInstance();
	      Calendar calendar2 = Calendar.getInstance();
	     
	      calendar1.set(year1, month1, day1);
	      calendar2.set(getYear(), getMoth(), getDay());
	      long milsecs1 = calendar1.getTimeInMillis();
	      long milsecs2 = calendar2.getTimeInMillis();
	      long diff = milsecs2 - milsecs1;
	      long dsecs = diff / 1000;
	      long dminutes = diff / (60 * 1000);
	      long dhours = diff / (60 * 60 * 1000);
	      long ddays = diff / (24 * 60 * 60 * 1000);
	      if(ddays > days){
	    	  return false;
	      }else {
	    	  return true;
	      }
		
	}
	
	public static void compareDate(int year1, int month1, int day1){
		  Calendar calendar1 = Calendar.getInstance();
	      Calendar calendar2 = Calendar.getInstance();
	     
	      calendar1.set(year1, month1, day1);
	      calendar2.set(getYear(), getMoth(), getDay());
	      long milsecs1 = calendar1.getTimeInMillis();
	      long milsecs2 = calendar2.getTimeInMillis();
	      long diff = milsecs2 - milsecs1;
	      long dsecs = diff / 1000;
	      long dminutes = diff / (60 * 1000);
	      long dhours = diff / (60 * 60 * 1000);
	      long ddays = diff / (24 * 60 * 60 * 1000);

	      //System.out.println("Your Day Difference="+ddays);
      
	}
}
