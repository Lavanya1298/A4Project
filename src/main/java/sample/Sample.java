package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Sample {

	public static void main(String[] args) throws Exception  {
		
		FileInputStream fis = new FileInputStream("C:\\SELENIUM\\A4CommonData.properties");
				Properties pro = new Properties();
				pro.load(fis);
				String URL = pro.getProperty("url");
				String USERNAME = pro.getProperty("username");
				String PASS = pro.getProperty("password");
				System.out.println(URL);
				System.out.println(USERNAME);
				System.out.println(PASS);
				 
	}

}