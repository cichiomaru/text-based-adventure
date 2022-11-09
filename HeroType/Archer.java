package HeroType;

import Gameplay.Enemy;
import Gameplay.Hero;
import Gameplay.IAttack;
import Gameplay.IDamageable;

public class Archer extends Hero implements IDamageable, IAttack {
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
	@Override
	public void TakeDamage(int damage) {
		int value = damage * 2;
		hp -= value;
	}
	@Override
	public void Attack(IDamageable target) {
		target.TakeDamage(10);
	}
}