package tw.org.iii;

import java.io.*;

public class Brad50 {
	public static void main(String[] args) {
		File file = new File("./dir1/file1.txt");
		try{
			FileInputStream fin = 
					new FileInputStream(file);
			byte[] buf = new byte[(int)file.length()]; 
			int len = fin.read(buf);
			System.out.println(new String(buf, 0, len));
			fin.close();
//		}catch(FileNotFoundException ee){
//			System.out.println(ee.toString());
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
	}
}
