package vk2;
import java.util.Scanner;

public class teht2_3_Mainclass {
	public static void main(String[] args) {
		System.out.print("Anna koiralle nimi: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		teht2_3 dog = new teht2_3(name);

		System.out.print("Mitä koira sanoo: ");
		String phrase = sc.nextLine();
		
		dog.speak(phrase);
	}
}
