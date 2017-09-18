package vk2;

import java.util.Scanner;

public class vk2_5Dog {
	private String name;
	private String says;
	
	//constructor
	public vk2_5Dog(String dogname) {
		if(dogname.trim().isEmpty() == false) {	
			name = dogname;
			System.out.println("Hei, nimeni on "+dogname);
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
		Scanner sc2 = new Scanner(says);
		while(sc2.hasNext()) {
			if (sc2.hasNextBoolean()) {
				System.out.println("Such boolean: "+sc2.nextBoolean());
			}
			else if (sc2.hasNextInt()) {
				System.out.println("Such integer: "+sc2.nextInt());
			}
			else {
				System.out.println(sc2.next());
			}
		}
	}
}
