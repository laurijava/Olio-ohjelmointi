package vk2;

public class teht2_3 {
	String name;
	
	//constructor
	public teht2_3(String dogname) {
		name = dogname;
		System.out.println("Hei, nimeni on "+name+"!");
	}
	
	public void speak(String phrase) {
		System.out.println(name+": "+phrase);
	}
}
