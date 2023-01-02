package recursion;

//3rd question
public class SumOfN {

	public static void main(String[] args) {
			System.out.println(sum(5));
	}
	
	static int sum(int n) {
		
		if(n==1)
			return 1;
		
		int s=0;	
		s= n+ sum(n-1);
		return s;
	}
}
		