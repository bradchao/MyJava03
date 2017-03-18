package tw.org.iii;

public class Brad19 {

	public static void main(String[] args) {
		System.out.println(Math.PI);	
		System.out.println(Bike.counter);	
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(Bike.counter);	
		
		System.out.println("---");
		
		System.out.println(b1.getSpeed());
		System.out.println(b2.getSpeed());
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		System.out.println(b1.getSpeed());
		
		b2.upSpeed();
		System.out.println("1. " + b2.getSpeed());
		b2.upSpeed();
		System.out.println("2. " + b2.getSpeed());
		b2.upSpeed(1);
		System.out.println("3. " + b2.getSpeed());
		b2.upSpeed(2);
		System.out.println("4. " + b2.getSpeed());
	}

}
