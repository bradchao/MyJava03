package tw.org.iii;

public class PokerV3 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		boolean[] check = new boolean[10];	// 0 - 51: false
		int[] poker = new int[10]; // 0- 51: 0
		int temp; int counter=0;
		for (int i=0; i<10; i++){
			do{
				temp = (int)(Math.random()*10);
				counter++;
			}while (check[temp]);
			
			poker[i] = temp;
			check[temp] = true;
			System.out.println(temp);
		}
		System.out.println("耗時:" + (System.currentTimeMillis() - start));
		System.out.println("次數:" + counter);
	}

}
