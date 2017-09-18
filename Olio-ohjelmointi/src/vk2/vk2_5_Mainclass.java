package vk2;

import java.util.Scanner;

public class vk2_5_Mainclass {
	public static void main(String[] args) {
		System.out.print("Anna koiralle nimi: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		vk2_5Dog dog = new vk2_5Dog(name);

		System.out.print("Mitä koira sanoo: ");
		String phrase = sc.nextLine();
		
		dog.speak(phrase);
		sc.close();
	}
}
