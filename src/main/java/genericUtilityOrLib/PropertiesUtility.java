package genericUtilityOrLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * this class is the properties class with generic function
 * @author Sindhura
 * @version 1.8.24*/
public class PropertiesUtility {

		/**
		 * this is generic method to read data from properties
		 */
		public String getDataFromProperties(String data) throws Exception
		{
			FileInputStream fis = new FileInputStream("C:\\SELENIUM\\A4CommonData.properties");
			Properties pobj = new Properties();
			pobj.load(fis);
	       String value = pobj.getProperty(data);
			return value;
			
		}

	}
	


