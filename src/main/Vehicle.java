package main;


public abstract class Vehicle {
	  private String name;
	  private String color;
	  protected int distance = 0;
	  private Person owner;
	  protected int x = 0;
	  protected int velocity = 0;

	  public Vehicle(String name, String color) {
	    this.name = name;
	    this.color = color;
	  }

	  public String getName() {
	    return this.name;
	  }
	  public String getColor() {
	    return this.color;
	  }
	  public int getDistance() {
	    return this.distance;
	  }
	  public Person getOwner() {
	    return this.owner;
	  }
	  public void setName(String name) {
	    this.name = name;
	  }
	  public void setColor(String color) {
	    this.color = color;
	  }
	  public void setOwner(Person person) {
	    this.owner = person;
	  }

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public void printData() {
	    System.out.println("名前：" + this.name);
	    System.out.println("色：" + this.color);
	    System.out.println("走行距離：" + this.distance + "km");
	}

//	public abstract void run(int distance);
	
	public abstract void go(int time);
	
	public abstract void back(int time);
	
	public static void diff(int x1,int x2) {
		//インスタンスメソッドであることに違和感を感じたので静的メソッドに
		//他のメソッドに合わせて標準出力することに
		int difference = x1 - x2;
		System.out.println("現在位置の差は" + Math.abs(difference) + "kmです");
	}
	
}
