package tw.org.iii;

public class Brad40 {
	public static void main(String[] args) {
		String s1 = "Brad";
		String s2 = s1;
		System.out.println(s1 == s2);
		s1 = "Mary";
		System.out.println(s1 == s2);
		System.out.println("---");
		String s3 = "Brad";
		System.out.println(s3.concat("1234567"));
		System.out.println(s3);
		System.out.println(s3.replace('a', 'A'));
		System.out.println(s3);
		
	}
}
