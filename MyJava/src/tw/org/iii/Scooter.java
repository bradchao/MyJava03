package tw.org.iii;

public class Scooter extends Bike {
	Scooter(){
		// super();
		System.out.println("Scooter()");
	}
	void upSpeed(){
		super.upSpeed();
		speed = (speed<1)?1.5:(speed*3.2);
	}
}
