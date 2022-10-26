package Gameplay;

import java.util.Scanner;

public abstract class GameUtility {
	public static Scanner scanner;
	
	public static Scanner GetScanner() {
		if (scanner == null) {
			scanner = new Scanner(System.in);
		}
		
		return scanner;
	}

	public static void ShowMessage(String msg) {
		System.out.println("[System]: " + msg);
	}
}
