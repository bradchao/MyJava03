package tw.org.iii;
// Exception
public class Brad44 {
	public static void main(String[] args) {
		int a = 10, b = 3;
		int[] c = {1,2,3,4};
		try{
			System.out.println(a / b);
			try{
				System.out.println(c[4]);
			}catch(Exception ee){
				
			}
			System.out.println("OK");
		}catch(ArithmeticException ae){
			System.out.println("87");
		}catch(ArrayIndexOutOfBoundsException ee){
			System.out.println("XX");
		}catch (RuntimeException re){
			System.out.println("OK");
		}
		System.out.println("Hello, World");
	}
}
