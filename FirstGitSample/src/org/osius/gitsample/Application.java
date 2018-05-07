package org.osius.gitsample;

public class Application {

	public static void main(String[] args) {
		
		Greetings gobj = new Greetings();
		gobj.display();
		displayGreetings();
	

	}
	
	public static void displayGreetings() {
		System.out.println("1. Greetings From GitHub");
		System.out.println("2. Greetings From Git Lab");
	}

}
