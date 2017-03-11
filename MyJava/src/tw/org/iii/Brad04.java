package tw.org.iii;

import javax.swing.JOptionPane;

public class Brad04 {

	public static void main(String[] args) {
		String input = 
				JOptionPane.showInputDialog("輸入年分");
		int year = Integer.parseInt(input);
		if (year % 4 == 0){
			if (year % 100 == 0){
				if (year % 400 == 0){
					// 29
				}else{
					// 28
				}
			}else{
				// 29
			}
		}else{
			// 28
		}
	}

}
