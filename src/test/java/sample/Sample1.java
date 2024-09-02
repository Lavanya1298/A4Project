package sample;

import org.testng.annotations.Test;

public class Sample1 {

	@Test(priority=1)
	
	public void createUser()
	{
		System.out.println("user created");
		
		
	}
	@Test(priority=2,dependsOnMethods= ("createUser"))
	public void modify()
	{
	System.out.println("user modified");
}
	@Test(priority=3)
	public void delete()
	{
		System.out.println("user deleted");
	}
}