package vk2;

import java.util.Scanner;

public class Dog {
	private String name;
	private String says;
	
	
	//constructor
	public Dog(String dogname) {
		if(dogname.isEmpty() == false) {	
			name = dogname;
			System.out.println("Hei, nimeni on "+dogname+"!");
			//says = "Hei, nimeni on" + dogname + "!";
		}
		else {
			name = "Doge";
			says = "Much wow!";
		}
		
	}
	
	public void speak(String phrase) {
		
		while(true) {
			if(phrase.isEmpty() == true) {
				System.out.println(says);
				System.out.println("Anna uusi lausahdus: ");
				
				Scanner scan = new Scanner(System.in);
				phrase = scan.next().trim();	
			}
			else {
				says = phrase;
				break;
			}
		}
		System.out.println(name+": "+says);
	}
}
