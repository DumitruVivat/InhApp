package main;

import auto.AutoTransport;
import auto.AviaTransport;
import auto.WaterTransport;

public class Application {

	public static void main(String[] args) {
	   //FORBIDEN 
		// 1) private/protected
		// 2) abstract super class
		
		AviaTransport avt = new AviaTransport();
		AutoTransport aut = new AutoTransport();
		WaterTransport awt = new WaterTransport();
		
		avt.printInfo();
		aut.printInfo();
		awt.printInfo();
		
		

	}
}
