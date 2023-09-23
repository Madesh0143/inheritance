package com.hierarchical.inheritance;

// HIERACHICAL INHERITANCE 

class Acount
{
	long   Acc_no;
	String Owner_name;
	double Balance;
	
	public void deposit(double Amt) 
	{
		Balance = Balance + Amt;
		System.out.println("Deposited Amount : "+Amt+" Current Amount : "+Balance);
	}
	
	public void withdraw(double Amt) 
	{
		Balance = Balance - Amt;
		System.out.println("Withdraw Amount : "+Amt+" Current Amount : "+Balance);
	}
}

class Savings extends Acount  // SUB CLASS
{
	double roi = .05; // roi mean rate of intrest
	
	public void calculate_roi() 
	{
		Balance = Balance + Balance * roi;
		System.out.println("Savings Amount : "+Balance+" With Rs/- "+roi+" % Intrest ");
	}
}

class Current extends Acount // SUB CLASS
{
	final double minbal =500.0; // minbal = minimum balance
	
	public void showminbal() 
	{
	   System.out.println("Show Minimum Balance : "+minbal);	
	}
}


public class Main_Method 
{
	public static void main(String...args) 
	{
		// Savings Acount
		Savings s = new Savings();
		        s.deposit(1000.0);
		        s.calculate_roi();
		        s.withdraw(500);
		// Current Account
		Current c = new Current();
		        c.deposit(500.0);
		        c.withdraw(100.0);
		        c.showminbal();
	}
}
