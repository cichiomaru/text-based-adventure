package Gameplay;

public abstract class Hero {
	// attribute
	protected String characterName;
	protected int hp;
	protected int maxHp;
	
	// constructor
	public Hero(String _name) {
		characterName = _name;
		System.out.println("Player " + characterName + " is created!");
	}
	
	public Hero() {
		System.out.print("What is your name? ");
		characterName = GameUtility.GetScanner().nextLine();
		
		System.out.println("Player " + characterName + " is created!");
	}
	public void ChangeName(String newName) {
		characterName = newName;
	}
}
