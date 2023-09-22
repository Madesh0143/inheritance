package com.single.inheritance;

//SINGLE INHERITTANCE..

class Father
{
	double paint=650.0;
	double shirt=550.0;
	double shose=950.0;
	public void bike() 
	{
		System.out.println(" RX-100 Yamaha ");
	}
}
class Son extends Father
{
	// savinges amount
	double Rs=2250.0;
	// bought a new cycle
	public void cycle() 
	{
		System.out.println(" My new cycle");
	}
}


public class Main_Method 
{
	public static void main(String[] args) 
	{
		Son S = new Son();
		    S.bike();
		    S.cycle();
		    
		    System.out.println(" Paint cost is Rs/- "+S.paint);
		    System.out.println(" Shirt cost is Rs/- "+S.shirt);
		    System.out.println(" Shose cost is Rs/- "+S.shose);
		    System.out.println(" My Saving Amount is Rs/- "+S.Rs);
	}
}
