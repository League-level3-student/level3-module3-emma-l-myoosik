package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animals> farm = new ArrayList<Animals>();
		farm.add(new Pig());
		farm.add(new Cow());
		farm.add(new Horse());
		farm.add(new Pig());
		farm.add(new Sheep());
		farm.add(new Sheep());
		
		for (int i = 0; i < farm.size(); i++) {
			farm.get(i).makeNoise();
			farm.get(i).eatFood();
			System.out.println();
		}
	}
}
