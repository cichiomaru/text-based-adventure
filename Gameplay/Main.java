package Gameplay;

import HeroType.Archer;
import HeroType.Warrior;

/*
 * Adventure Game
 * Text based
 * Area:
 * 	1. Town
 *  2. Dungeon 
 */
public class Main {
	private boolean isGameOver = false;
	
	public Main() {
		ShowWelcomeMessage();
		CreateCharacter();
		
		do {
			GameLoop();	
			
			// for debuggin purpose
			GameUtility.GetScanner().nextLine();
		} while (isGameOver == false);
	}
	
	private void GameLoop() {
		// TODO Auto-generated method stub
		
	}

	private void CreateCharacter() {
		// TODO Auto-generated method stub
		Archer archer = new Archer();
		Warrior warrior = new Warrior();
		Enemy enemy = new Enemy();
		Building building = new Building();
		
		archer.RangedAttack();
		warrior.Rage();
		
		archer.TakeDamage(10);
		warrior.TakeDamage(10);
		//enemy.TakeDamage(10);
		
		IAttack[] targets = new IAttack[3];
		targets[0] = archer;
		targets[1] = warrior;
		targets[2] = enemy;
		
		archer.Attack(enemy);
	}

	private void ShowWelcomeMessage() {
		//System.out.println("[System]: Welcome to Text Based Adventure Game!");
		GameUtility.ShowMessage("Welcome to Text Based Adventure Game!");
	}

	public static void main(String[] args) {
		new Main();
	}
}
