package com.zensar.spring.performers;

import com.zensar.spring.instruments.Instrument;

/*Author:Ashi Pal
 *Creation Date:27 July 2019 12:47PM IST
 *Modified Date:27 July 2019 12:47PM IST
 *Version:1.0
 *Copyright: Zensar Technologies
 *Description:it is used to represent instrumentalist of zensar idol competition
 */
public class Instrumenalist implements Performer {
	
	private String song;
	private Instrument instrument;

	
	//for setter injection
	public void setSong(String song) {
		this.song = song;
		System.out.println("song is set");
		System.out.println(song);
	}


	//for setter injections
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("intrument is set");
	}



	public void perform() {
		System.out.println("instrumenalist is playing a song");
		instrument.play();

	}

}
