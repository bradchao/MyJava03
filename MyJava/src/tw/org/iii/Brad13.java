package tw.org.iii;

/*
 * Program: Brad13
 * Function: 
 * 	1.for-each 
 *  2.exchange array element
 */
public class Brad13 {

	public static void main(String[] args) {
		int[] a = new int[52];	 // 0-51: 0
		for (int i=0; i<a.length; i++) a[i] = i;
		
		// method 1:
		for (int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		System.out.println("--");
		// method 2:
		for (int v: a){
			System.out.println(v);
		}
		// exchange: 2 <-> 5
		int temp = a[2];
		a[2] = a[5];
		a[5] = temp;
		System.out.println("--");
		// method 2:
		for (int v: a){
			System.out.println(v);
		}
		System.out.println("--");
		int[][] b = {{1,2,3,4},{5,6,7},{8,9},{10},{11,12,13}};
		// method 1:
		for (int i=0; i<b.length; i++){
			for (int j=0; j<b[i].length; j++){
				System.out.print(b[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("--");
		// method 2:
		for (int[] v1:b){
			for (int v2 : v1){
				System.out.print(v2 + "  ");
			}
			System.out.println();
		}
		
		
		
	}

	
	
	
	
	
	
	
}
