package _03_Intro_to_Enums;

import javax.swing.JOptionPane;

public enum StatesOfMatter {
	
SOLID(0), LIQUID(25), GAS(100);
	
	int celsiusTemp;
	
	private StatesOfMatter(int celsiusTemp) {
		this.celsiusTemp = celsiusTemp;
	}
	
	public int convertToFahrenheit(int e) {
		int f = (e * 9/5) + 32;
		
		return f;
	}
}
