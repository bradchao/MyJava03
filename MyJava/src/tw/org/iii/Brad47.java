package tw.org.iii;
public class Brad47 {
	public static void main(String[] args) {
		new Brad471().m1();
	}
}
class Brad471 {
	void m1(){
		try{
			System.out.println("do something");
			throw new Exception();
		}catch(Exception ee){
			System.out.println("catch");
			return;
		}finally {
			System.out.println("OK");
		}
		//System.out.println("end");
	}
}
