package recursion;

//4th question
public class SumOfSquares {

	public static void main(String[] args) {
		
		System.out.println(squareSum(5));
	}
	
	static int squareSum(int n) {
		
		if(n==1)
			return 1;
		
		int s=0;
		
		s= n*n + squareSum(n-1);
		return s;
		
	}
}
