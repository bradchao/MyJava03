package tw.org.iii;

public class TWId {
	private String id;
	TWId(String id){
		this.id = id;
	}
	// true => female; false => male
	boolean isFemale(){
		char gender = id.charAt(1); // A123456789 => '1'
		return gender=='2';
	}
	
	static boolean isCheckOK(String id){
		String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
		char f0 = id.charAt(0);
		int n12 = letters.indexOf(f0) + 10;	// 'Y' => 21 + 10 = 31
		int n1 = n12 / 10;
		int n2 = n12 % 10;
		System.out.println(id.substring(3, 4));
		
		return true;
	}
	
	String getId(){
		return id;
	}
}
