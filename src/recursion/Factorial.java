package recursion;

//5th question
public class Factorial {

	public static void main(String[] args) {
		
			System.out.println(fact(5));
	}
	
static int fact(int n) {
		
		if(n==1)
			return 1;
		
		int s=0;
		
		s= n* fact(n-1);
		return s;
		
	}

}
