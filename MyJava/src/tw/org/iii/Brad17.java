package tw.org.iii;

import javax.swing.JOptionPane;

/*
 * Program: Guess Number game
 */
public class Brad17 {
	
	public static void main(String[] args) {
		// 1. Create Answer
		String answer = createAnswer(3);
		System.out.println(answer);
		
		// 2. Start
		for (int i=0; i<10; i++){
			// 2-1. input a number string
			String guess = JOptionPane.showInputDialog("猜一個數字");
			
			// 2-2. compare string => result
			String result = checkAB(answer, guess); 
			JOptionPane.showMessageDialog(null, result);
			// 2-3. WINNER -> break
			// 2-4. repeat 10 times > LOSSER
		}
		
		// 3. show ..... / .... 
	}
	
	// method: checkAB(answer, guess) => ?A?B 
	static String checkAB(String a, String g){
		
		return "1A2B";
	}
	
	
	// method: create a answer
	static String createAnswer(int d){
		// 洗牌
		boolean[] check = new boolean[10];	// 0 - 9: false
		int[] poker = new int[d]; // 0-2: 0
		int temp; int counter=0;
		for (int i=0; i<poker.length; i++){
			do{
				temp = (int)(Math.random()*10);
				counter++;
			}while (check[temp]);
			poker[i] = temp;
			check[temp] = true;
		}
		String ret = "";
		for(int v:poker) ret += v;
		
		return ret;
	}

	
	
	
	
	
	
}
