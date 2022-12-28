package recursion;

public class DecrisingIncresing {

	public static void main(String[] args) {
		pdi(5);
		
		

	}
	
	public static void pdi(int n) {
		
		if(n<1) {
			return ;
		}
		pdi(n-1);
		System.out.println(n);
	}

}
