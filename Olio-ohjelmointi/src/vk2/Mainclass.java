package vk2;

import java.util.Scanner;

import vk2.Dog;

public class Mainclass {

	public static void main(String[] args) {
		System.out.println("Anna koiralle nimi: ");
		Scanner sc = new Scanner(System.in); // scanner object
		String nimi = sc.next().trim();
		
		System.out.println("Anna lausahdus: ");
		String lausahdus = sc.nextLine().trim();
		
		
		Dog koira = new Dog(nimi);
		koira.speak(lausahdus);

	}

}
