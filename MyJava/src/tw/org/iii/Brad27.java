package tw.org.iii;
public class Brad27 {
	public static void main(String[] args) {
		Brad271 b1 = new Brad272();
		Brad271 b2 = new Brad273();
		b1.m2();
		b2.m2();
	}
}
abstract class Brad271 {
	Brad271(){System.out.println("Brad271()");}
	void m1(){System.out.println("Brad271:m1()");}
	abstract void m2();
}
class Brad272 extends Brad271 {
	void m2(){System.out.println("Brad272:m2()");}
}
class Brad273 extends Brad271 {
	void m2(){System.out.println("Brad273:m2()");}
}
abstract class Brad274 extends Brad271 {
	void m3(){}
	abstract void m4();
}
abstract class Brad275 {
	void m1(){}
}