package vk2;

public class teht2_2 {
	String name;
	
	//constructor
	public teht2_2(String dogname) {
		name = dogname;
		System.out.println("Hei, nimeni on "+dogname+"!");
	}
	
	public void speak(String phrase) {
		System.out.println(name+": "+phrase);
	}
}
