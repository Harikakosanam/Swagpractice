package swaglabs;


import java.util.Date;
import java.util.Random;

import com.github.javafaker.Faker;

public class TestDataCreation {	
	Faker faker = new Faker();	
public int generateRandomNumber() 
{
Random random  = new  Random();
int number=random.nextInt(1000);
return number;
}

public String getFristName() 
{
return faker.name().firstName();
}

public String getLastname() {
	return faker.name().lastName();
}

public String getPincode()
{
	return faker.address().zipCode();
}

}
