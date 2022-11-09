package Gameplay;

public class Building implements IDamageable {
	boolean isDestroyed = false;
	
	@Override
	public void TakeDamage(int damage) {
		if (damage > 0) {
			isDestroyed = true;
		}
	}
}
