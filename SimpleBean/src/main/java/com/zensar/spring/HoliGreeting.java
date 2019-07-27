package com.zensar.spring;

/*Author:Ashi Pal
 *Creation Date:27 July 2019 12:47PM IST
 *Modified Date:27 July 2019 12:47PM IST
 *Version:1.0
 *Copyright: Zensar Technologies
 *Description:It is the specialized class to greet anybody on Holi
 */
public class HoliGreeting implements Greeting {

	public HoliGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("holi greeting created");
	}
	
	public String sayGreet() {
		// TODO Auto-generated method stub
		
		return ("happy holi");
	}

}
