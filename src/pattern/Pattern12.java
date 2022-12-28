package pattern;

public class Pattern12 {

	public static void main(String[] args) {
		
		printTriangle(5);
	}
	
	public static void printTriangle(int n) {
        
        int left=1;
        int right=1;
        int trueLeft=1;
        int trueRight=1;
        for(int o=1;o<=n;o++){
            
            for(int i=1;i<=2*n;i++){
                if(left<=trueLeft){
                    System.out.print(left+" ");
                    //to making exactly output space
                    if(left==trueLeft && left!=n){ 
                        System.out.print("  ");
                    }
                    left++;
                }
                else if((2*n)-trueRight<=i){
                    if(right>=1){
                        System.out.print(right+" ");
                        right--;
                    }
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
            left=1;
            trueLeft++;
            right=++trueRight;
        }
        //2*n internal loop chlega
        // left ko print krne k trueLeft liya h
        // right ko print krne k liye trueRight liya h
        // important yha index bhi important hai
        // iske jaise jaise right bdega 2*n-trueRight iski inital value hogi
    }

}
