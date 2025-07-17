package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Bicycle;

public class BicycleTest {
	@Test
	public void testGo() {
		Bicycle testBicycle = new Bicycle("テスト自転車","テスト色");
		testBicycle.setVelocity(10);
		int time = 6;
		testBicycle.go(time);
		assertEquals(60, testBicycle.getVelocity()*time);
	}
	
	@Test
	public void testBack() {
		Bicycle testBicycle = new Bicycle("テスト自転車","テスト色");
		testBicycle.setVelocity(10);
		testBicycle.back(3);
	}
}
