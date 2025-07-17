package main;


public class Car extends Vehicle{
	  private int fuel = 50;

	  public Car(String name, String color) {
	    super(name, color);
	  }

	  public int getFuel() {
	    return this.fuel;
	  }

	  public void printData() {
	    super.printData();
	    System.out.println("ガソリン量：" + this.fuel + "L");
	  }
	  
//	  public void run(int distance) {
//	    System.out.println(distance + "km走ります");
//	    if (distance <= this.fuel) {
//	      this.distance += distance;
//	      this.fuel -= distance;
//	    } else {
//	      System.out.println("ガソリンが足りません");
//	    }
//	    System.out.println("走行距離：" + this.distance + "km");
//	    System.out.println("ガソリン量：" + this.fuel + "L");
//	  }
	  
	  public void go(int time) {
		int goDistance = time * velocity;
		System.out.println(goDistance + "km進みます");
		if (goDistance <= this.fuel) {
		  this.distance += goDistance;
		  this.fuel -= goDistance;
		  this.x += goDistance;
		} else {
		  System.out.println("ガソリンが足りません");
		}
		System.out.println("走行距離：" + this.distance + "km");
		System.out.println("ガソリン量：" + this.fuel + "L");
		System.out.println("現在位置：" + this.x + "km");
	  }
	  
	  public void back(int time) {
		int backDistance = time * velocity;
		System.out.println(backDistance + "km戻ります");
		if (backDistance <= this.fuel) {
		  this.distance += backDistance;
		  this.fuel -= backDistance;
		  this.x += backDistance;
		} else {
		  System.out.println("ガソリンが足りません");
		}
		System.out.println("走行距離：" + this.distance + "km");
		System.out.println("ガソリン量：" + this.fuel + "L");
		System.out.println("現在位置：" + this.x + "km");
	  }

	  public void charge(int litre) {
	    System.out.println(litre + "L給油します");
	    if (litre <= 0) {
	      System.out.println("給油できません");
	    } else if (litre + this.fuel >= 100) {
	      System.out.println("満タンまで給油します");
	      this.fuel = 100;
	    } else {
	      this.fuel += litre;
	    }
	    System.out.println("ガソリン量：" + this.fuel + "L");
	  }
}
