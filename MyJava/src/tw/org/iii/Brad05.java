package tw.org.iii;

public class Brad05{
	public static void main(String[] args) {
		int a = 10, b = 3;
		int v1 = 2, v2 = 3;
		int v3 = v1 ^ v2;
		System.out.println(v3);
		
		
		if (--a >= 10 & b++ <= 3){
			System.out.println("OK:a = " + a + ",b=" + b);
		}else{
			System.out.println("XX:a = " + a + ",b=" + b);
		}
	}
}
