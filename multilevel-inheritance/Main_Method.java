package com.inheritance.multilevel;

// MULTI-LEVEL INHERITANCE   


class insta_v1   // Eg: Instagram , What's app  versions
{
	public void sendMsg() 
	{
		System.out.println("Send message ");
	}
}

class insta_v2 extends insta_v1
{
	public void sendAudioMsg() 
	{
		System.out.println("Send Audio Message");
	}
}

class insta_v3 extends insta_v2
{
    public void viewStory() 
    {
		System.out.println("View Storys....");
	}
}


public class Main_Method 
{
	public static void main(String[] args) 
	{
		System.out.println("Instagram updated versions"); // WITH THE HELP OF INHERITANCE
		System.out.println("---------------------------");
		
		insta_v3 v3 = new insta_v3();
		         v3.sendMsg();
		         v3.sendAudioMsg();
		         v3.viewStory();
		         
	    System.out.println("---------------------------");
	    System.out.println("WITH THE HELP OF INHERITANCE"); 
	}

}
