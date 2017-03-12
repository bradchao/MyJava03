package tw.org.iii;

public class Brad15 {

	public static void main(String[] args) {
		int a = 1; int sum = 0;
		while (a<=100){
			sum += a++;
		}
		System.out.println("1 + 2 + ... + 100 = " + sum);
		System.out.println("---");
		a = 1; sum = 0;
		for (;a<=100;){
			sum += a++;
		}
		System.out.println("1 + 2 + ... + 100 = " + sum);
		
		
		
	}

}
