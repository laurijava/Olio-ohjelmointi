package vk2;

import java.util.Scanner;

public class teht2_4_Mainclass {
	public static void main(String[] args) {
		System.out.print("Anna koiralle nimi: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		teht2_4Dog dog = new teht2_4Dog(name);

		System.out.print("Mitä koira sanoo: ");
		String phrase = sc.nextLine();
		
		dog.speak(phrase);
		sc.close();
	}
}
