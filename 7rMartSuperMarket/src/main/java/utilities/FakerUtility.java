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
	//Get random email ID
    public String getEmail() 
    {
        return fakeObj.internet().emailAddress();
    }

    // Get random phone number
    public String getPhoneNumber() 
    {
        return fakeObj.phoneNumber().cellPhone();
    }

    // Get random full address
    public String getAddress() 
    {
        return fakeObj.address().fullAddress();
    }

    // Get random company name
    public String getCompanyName() 
    {
        return fakeObj.company().name();
    }
}
