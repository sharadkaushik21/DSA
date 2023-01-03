package recursion;

//6th question
public class OddNumbers {

	public static void main(String[] args) {

		odd(10);
	}
	
	static void odd(int n) {
		
		if(n==1) {
			System.out.print(1+" ");
		return;  }
		
		//Descending order
		if(n%2==1)
			System.out.print(n+" ");
		odd(n-1);
		//ascending order
//		if(n%2==1)
//			System.out.print(n+" ");
		
	}

}
