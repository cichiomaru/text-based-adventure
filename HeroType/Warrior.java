package HeroType;

import Gameplay.Hero;

public class Warrior extends Hero {
	public int rageMeter;
	
	public Warrior () {
		super();
		hp = maxHp = 20;
	}
	public void Rage() {
		System.out.printf("%s is using Rage!\n", characterName);
		rageMeter = 0;
		
		System.out.println("Rage depleted.");
	}
}
