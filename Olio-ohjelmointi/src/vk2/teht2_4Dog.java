package vk2;

import java.util.Scanner;

public class teht2_4Dog {
	private String name;
	private String says;
	
	//constructor
	public teht2_4Dog(String dogname) {
		if(dogname.trim().isEmpty() == false) {	
			name = dogname;
			System.out.println("Hei, nimeni on "+dogname+"!");
		}
		else {
			name = "Doge";
			says = "Much wow!";
		}
	}
	
	public void speak(String phrase) {
		while(true) {
			if(phrase.trim().isEmpty() == true) {
				says = "Much wow!"; // set default phrase
				System.out.println(name+": "+says);
				System.out.print("Mitä koira sanoo: ");
				
				Scanner sc = new Scanner(System.in);
				phrase = sc.nextLine();
			}
			else {
				says = phrase;
				break;
			}
		}
		System.out.println(name+": "+says);
	}
}
