package recursion;

//2nd question in Recursion
public class Incresing {

	public static void main(String[] args) {
		
		printIncresing(5);
		
	}
	
	static void printIncresing(int n) {
		
		if(n<1) {
			return;
		}
		printIncresing(n-1);
		System.out.println(n);
		
	}
}

//	pi(1)    	  	| 1    |
//			pi(2)	| 2    |
//			pi(3)	| 3    |
//		pi(4)		| 4    |		
//		PI(5)		|5     |
//call from main	|5     |
//					--------
//					stack	