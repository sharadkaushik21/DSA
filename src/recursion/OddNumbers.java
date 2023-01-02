package recursion;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		odd(10);
	}
	
	static void odd(int n) {
		
		if(n==1) {
			System.out.print(1+" ");
		return;  }
		
		odd(n-1);
		if(n%2==1)
			System.out.print(n+" ");
		
	}

}
