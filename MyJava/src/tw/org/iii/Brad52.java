package tw.org.iii;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilterReader;

public class Brad52 {

	public static void main(String[] args) {
		File file = new File("./dir1/Book1.csv");
		try{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String temp;
			while ( (temp = br.readLine()) != null){
				System.out.println(temp);
			}
			fr.close();
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
	}

}
