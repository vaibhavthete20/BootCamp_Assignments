package com.tut.dayone.homework;

public class TimeConversion {

	public static void main(String[] args) {

//		4. Time conversion Develop a program which converts input seconds in hours and
//		minutes and seconds.
//		Eg. 7515 seconds = 2 Hours, 5 minutes and 15 seconds
		
		int seconds=7530;
		
		int hr=seconds/3600;
		
		int min = (seconds-hr*3600)/60;
		
		int sec =seconds-(hr*3600+min*60);
		
		System.out.println(hr +" " +"hours");
		System.out.println(min +" "+ "minutes");
		System.out.println(sec +" "+ "seconds");
	}

}
