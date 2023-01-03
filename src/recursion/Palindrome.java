package recursion;

public class Palindrome {

	public static void main(String[] args) {
		//zero for non-palindrome
		//one for palindrome
		System.out.println(isPalindrome("noon"));

		
	}

	static int helper(String str, int start, int end){
        if(str.charAt(start)!= str.charAt(end))
        return 0;
        
        if(start>=end) // ">" for even case,    
        return 1;
        
        return helper(str, start+1, end-1);
        
        
    }
    
   static int isPalindrome(String S) {
     
        return helper(S,0,S.length()-1);
     
    }
}
