package HeroType;

import Gameplay.Hero;
import Gameplay.IAttack;
import Gameplay.IDamageable;

public class Warrior extends Hero implements IDamageable, IAttack {
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
	@Override
	public void TakeDamage(int damage) {
		int value = damage / 2;
		hp -= value;
	}
	@Override
	public void Attack(IDamageable target) {
		target.TakeDamage(100);
	}
}
