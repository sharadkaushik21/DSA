package recursion;

public class PrintDecrising {

	public static void main(String[] args) {
		printDecrising(10);

	}
	
	//learnt from pepcoding. 1st video
	public static void printDecrising(int n) {
		
		/*
		 * first own approach. 
		 * if(n>=1)
		 *  { System.out.println(n);
		 *   printDecrising(n-1); }
		 */
		
		//base line i.e it will break the recursion
		if(n<1) {
			return;
		}
		System.out.println(n);
		printDecrising(n-1);
	}

}
