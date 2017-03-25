package tw.org.iii;
public class Brad43 {
	public static void main(String[] args) {
		Brad431 obj1 = new Brad431();
		Brad431.Brad4311 obj2 = obj1.new Brad4311();
		obj2.m1();
		Brad431.m3();
		Brad431.Brad4312 obj3 = new Brad431.Brad4312(); 
	}
}
class Brad431 {
	Brad431(){System.out.println("Brad431()");}
	void m1(){System.out.println("Brad431:m1()");}
	void m2(){System.out.println("Brad431:m2()");}
	static void m3(){}
	class Brad4311 {
		Brad4311(){System.out.println("Brad4311()");}
		void m1(){
			System.out.println("Brad4311:m1()");
			Brad431.this.m1();
		}
	}
	static class Brad4312 {
		Brad4312(){System.out.println("Brad4312()");}
		void m1(){
			System.out.println("Brad4312:m1()");
		}
	}
}
