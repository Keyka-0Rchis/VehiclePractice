package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class VehicleTest {
	@Test
	public void testDiff() {
		DummyVehicle dummyVehicle1 = new DummyVehicle("テスト１","テスト１カラー");
		DummyVehicle dummyVehicle2 = new DummyVehicle("テスト２","テスト２カラー");
		
		dummyVehicle1.setX(3);
		dummyVehicle2.setX(2);
		
		DummyVehicle.diff(dummyVehicle1.getX(), dummyVehicle2.getX());
		assertEquals(1, Math.abs(dummyVehicle1.getX()-dummyVehicle2.getX()));
	}
}
