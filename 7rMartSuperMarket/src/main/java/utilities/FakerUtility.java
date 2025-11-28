package utilities;

import com.github.javafaker.Faker;

public class FakerUtility 
{
	Faker fakeObj= new Faker(); 
	public String getUserName()
	{
		String username= fakeObj.name().firstName();
		return username;
		
		
	}
	public String getPassword()
	{
		String password= fakeObj.internet().password();
		return password;
	}
}
