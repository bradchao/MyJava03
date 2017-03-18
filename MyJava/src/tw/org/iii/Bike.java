package tw.org.iii;

public class Bike extends Object{
	double speed;
	int a;	// a = 0
	static int counter;	// b = 0
	
	Bike(){
		this(0);
		System.out.println("Bike()");
	}
	Bike(int s){
		this(s*1f);
	}
	Bike(float s){
		this(s*1.0);
	}
	Bike(double s){
		speed = s;
		a++; counter++;
		System.out.println("Bike:Bike()");
	}
	void upSpeed(){
		speed = (speed<1)?1:(speed*1.2);
	}
	void upSpeed(int gear){
		speed = (speed<1)?1:(speed*(1.2+gear));
	}
	void downSpeed(){
		speed *= 0.7;
	}
	double getSpeed(){
		return speed;
	}
}
