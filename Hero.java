package Gameplay;

public class Hero {
	// attribute
	private String name;
	public static String playerName;
	
	// constructor
	public Hero(String _name) {
		name = _name;
		System.out.println("Player " + name + " is created!");
	}
	
	public Hero() {
		System.out.print("What is your name? ");
		name = GameUtility.GetScanner().nextLine();
		
		System.out.println("Player " + name + " is created!");
	}
	
	/*
	 * <access modifier> <return type> <function name> (<params>) 
	 * {
	 * 	  return <return type>;
	 * }
	 */
	public void ChangeName(String newName) {
		name = newName;
	}
}
