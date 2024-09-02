package genericUtilityOrLib;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


public class JavaUtility {
	/** this is a generic Calendar handling method
	 * @parameter pattern
	 * @return
	 */
	public String calendarHandling(String pattren)
	{
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(pattren);
		String date = sdf.format(d);
		return date;
	}
/**
*this is a generic random class method to avoid duplicates
*@parameter range
*@return 
*/
	public int getRandomNumber(int range)
	{
		Random r = new Random();
		int num = r.nextInt(range);
		return num;
	}
	
}