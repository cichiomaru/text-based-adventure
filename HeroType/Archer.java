package HeroType;

import Gameplay.Hero;

public class Archer extends Hero {
	private int ammo;
	
	public Archer() {
		super();
		hp = maxHp = 10;
	}
	public void RangedAttack() {
		System.out.println(characterName + " is using Ranged Attack!");
		if (ammo > 0) {
			ammo--;			
		} else {
			System.out.println("Insufficient ammo.");
		}
	}
}