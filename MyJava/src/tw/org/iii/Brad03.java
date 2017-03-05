package tw.org.iii;

public class Brad03 {
	public static void main(String[] args) {
		//double score = Math.random();
		// 0 - 100
		int intScore = (int)(Math.random()*100+1);
		System.out.println(intScore);
		
		if (intScore>=60){
			System.out.println("Pass");
		}else{
			System.out.println("Down");
		}
	}
}
