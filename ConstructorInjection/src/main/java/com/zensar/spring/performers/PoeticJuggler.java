package com.zensar.spring.performers;

import com.zensar.spring.poems.Poem;

/*Author:Ashi Pal
 *Creation Date:27 July 2019 12:47PM IST
 *Modified Date:27 July 2019 12:47PM IST
 *Version:1.0
 *Copyright: Zensar Technologies
 *Description:It is use to represent a more skilled juggler who juggles while writing a poem.
 */
public class PoeticJuggler extends Juggler {
 
	private Poem poem;
	
	public PoeticJuggler() {
		System.out.println("no-agrs constructor of PoeticJuggler");
	}

	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
		System.out.println("parameter constructor of PoeticJuggler");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		super.perform();
		System.out.println("while reciting a poem....");
		poem.recite();
	}
	
}
