package main;


public class Bicycle extends Vehicle {
  public Bicycle(String name, String color) {
	    super(name, color);
  }

  public void go(int time) {
	int goDistance = time * velocity;
	System.out.println(goDistance + "km進みます");
	this.distance += goDistance;
	this.x += goDistance;
	System.out.println("走行距離：" + this.distance + "km");
	System.out.println("現在位置：" + this.x + "km");
  }
	  
  public void back(int time) {
	int backDistance = time * velocity;
	System.out.println(backDistance + "km戻ります");
	this.distance += backDistance;
	this.x -= backDistance;
	System.out.println("走行距離：" + this.distance + "km");
	System.out.println("現在位置：" + this.x + "km");
  }
}
