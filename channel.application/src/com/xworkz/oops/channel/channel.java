package com.xworkz.oops.channel;

public class channel {
	
	public byte noofchannel;
	public byte channelnu;
	public channel() {
		super();
		System.out.println("invoking channel constructor");
	}
	public void watching() {
		System.out.println("you can watching a movie");
	}
	public void changingchannel() {
		System.out.println("i will change the channel");
	}
	public int countchannel() {
		return 1000;
	}

}
