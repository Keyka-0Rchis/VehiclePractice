package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import main.Car;

public class CarTest {
	
	//goメソッドテスト
	@Test
	public void testGo() {
		Car testCar = new Car("テスト車","テスト色");
		testCar.setVelocity(10);
		int time = 5;
		testCar.go(time);
		assertEquals(50, testCar.getVelocity()*time);
	}

//	ガソリン不足の場合の出力チェックをしようとしたが、複数行にまたがっていて難しい。
//	値の計算とメッセージは分けたい。
	//ガソリン不足のgoメソッドテスト
	@Test
	public void testGoOver() {
		//出力を梱包するもの
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		//初期状態の控え
		PrintStream originalOut = System.out;
		//梱包開始
		System.setOut(new PrintStream(outContent));
		
		Car testCar = new Car("テスト車","テスト色");
		testCar.setVelocity(10);
		testCar.go(6);
		
		//文字列に直す
		String output = outContent.toString().trim();
		//内包されているかの確認
		assertTrue(output.contains("ガソリンが足りません"));
		
		//出力先を戻す
		System.setOut(originalOut);
	}
	
	//backメソッドのテスト
	@Test
	public void testBack() {
		Car testCar = new Car("テスト車","テスト色");
		testCar.setVelocity(10);
		testCar.back(3);
	}
	
	//ガソリン不足の場合のbackメソッドのテスト
	@Test
	public void testBackOver() {
		//出力を梱包するもの
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		//初期状態の控え
		PrintStream originalOut = System.out;
		//梱包開始
		System.setOut(new PrintStream(outContent));
		
		Car testCar = new Car("テスト車","テスト色");
		testCar.setVelocity(10);
		testCar.back(6);
		
		//文字列に直す
		String output = outContent.toString().trim();
		//内包されているかの確認
		assertTrue(output.contains("ガソリンが足りません"));
		
		//出力先を戻す
		System.setOut(originalOut);
	}
	
	//念のため、chargeメソッドのテスト
	@Test
	public void testCharge() {
		Car testCar = new Car("テスト車","テスト色");
		testCar.charge(1);
		assertEquals(51, testCar.getFuel());
	}
}
