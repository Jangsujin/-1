package dicetest;

import java.util.*;

class Dice {
	int face;
	
	
	public void setRoll() {
		 face = (int)(Math.random()*6)+1;
	}
	public int getRoll() {
		return face;
	}
}
public class DiceTest {
	public static void main(String args[]) {
		Dice x = new Dice();
		x.setRoll();
		System.out.println("주사위의 눈은 "+x.getRoll()+"입니다.");
	}

}
