package pattern;

public class Pattern8 {

	public static void main(String[] args) {
		printDiamond(5);
		
	}
	
	public static void printDiamond(int n) {
        
    int temp=n;
        for(int o=1;o<=2*n;o++){
            for(int i=1;i<=n;i++){
            if(i>=temp){
            System.out.print("* ");
            }
                else{
                System.out.print(" "); }
            }
            System.out.println();
            if(o!=n){
            if(o>=n){
                temp++;
            }
            else{
            temp--;
            }}
        }
        // total lines 2*n hogi
        // stars max n honge
       // actual pattern aisa
        // 5
        // 45
        // 345
        // 2345
        // 12345 yha tk temp++ hoga jab temp n k equal tab temp constant hoga taki same line print ho
        // 12345 is line temp-- hoga
        // 2345
        // 345
        // 45
        // 5
        // ye digit hi star hai
        // jab star print nhi hoga to space print hoga
        
        
    }

}
