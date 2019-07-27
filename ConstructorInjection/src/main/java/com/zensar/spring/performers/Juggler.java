package com.zensar.spring.performers;

/*Author:Ashi Pal
 *Creation Date:27 July 2019 12:47PM IST
 *Modified Date:27 July 2019 12:47PM IST
 *Version:1.0
 *Copyright: Zensar Technologies
 *Description:It is use to represent a performers Juggler of the Zensar Idol Competition
 *Juggler gets beanBags using constructor injection
 */

public class Juggler implements Performer {

	private int beanBags;
	
	public Juggler()
	{
		System.out.println("No-agr constructor of juggler");	
	}
	
	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
		System.out.println("parameter constructor of juggler");
	}

	public void perform() {
		System.out.println("juggler juggling "+beanBags);
	}

}
