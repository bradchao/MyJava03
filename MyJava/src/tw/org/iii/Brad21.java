package tw.org.iii;

public class Brad21 {

	public static void main(String[] args) {
		System.out.println(TWId.isCheckOK("A123"));
		
		TWId id1 = new TWId();
		TWId id2 = new TWId(1);
		TWId id3 = new TWId(false);
		TWId id4 = new TWId(true, 12);
		
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
		
		
//		TWId id1 = new TWId("A223456789");
//		System.out.println(id1.getId());
//		if (id1.isFemale()){
//			System.out.println("女生");
//		}else{
//			System.out.println("男的");
//		}
	}

}
