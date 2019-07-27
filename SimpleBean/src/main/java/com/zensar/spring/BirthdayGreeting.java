package com.zensar.spring;

/*Author:Ashi Pal
 *Creation Date:27 July 2019 12:47PM IST
 *Modified Date:27 July 2019 12:47PM IST
 *Version:1.0
 *Copyright: Zensar Technologies
 *Description:It is the specialized class to greet anybody on birthday
 */
public class BirthdayGreeting implements Greeting {
	
	public BirthdayGreeting()
	{
		System.out.println("birthday greeting created");
	}

	public String sayGreet()
	{
		return("wish you happy birthday");
	}
}
