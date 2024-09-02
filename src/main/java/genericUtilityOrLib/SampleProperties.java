package genericUtilityOrLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class SampleProperties {

	public String getDataFromProperties(String data) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\\\SELENIUM\\\\A4CommonData.properties");
		
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(data);		
		

		
		return value;
		
				
		
		
		
	}

}
