package com.zensar.spring.poems;

/*Author:Ashi Pal
 *Creation Date:27 July 2019 12:47PM IST
 *Modified Date:27 July 2019 12:47PM IST
 *Version:1.0
 *Copyright: Zensar Technologies
 */
public class TwinkleTwinkle implements Poem {

	private final static String LINES []={
			"Twinkle, twinkle, little star",
			"How I wonder what you are",
			"Up above the world so high",
			"Like a diamond in the sky",
	};
	
	public void recite() {
		for(String line:LINES)
			System.out.println(line);

	}

}
