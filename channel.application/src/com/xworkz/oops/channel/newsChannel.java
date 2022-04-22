package com.xworkz.oops.channel;

public class newsChannel {

	public byte noofnewschannel;
	public String publicnewschannel;
	 
	public void  setchannelnu (String number) {
		System.out.println("channel set"+number);
	}
	public void settimechannel(byte hours,byte minutes) {
		System.out.println("timer set for"+hours+"Hours and"+minutes+"minutes");
	}
		
	}

