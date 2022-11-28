package maths;

public class Lcm {

	public static void main(String[] args) {

		System.out.println(lcm(7, 8));
	}

	public static int lcm(int x, int y) {
		
		int res = 1; // result
		int div = 2; // started from 2 
		
		if (x == 0 || y == 0)
			return 0; //lcm of 0 is 0
		
		boolean flag = false;
		while (x > 1 || y > 1) {
			if (x % div == 0) {
				x = x / div;
				flag = true;
			}
			if (y % div == 0) {
				y = y / div;
				flag = true;
			}
			if (flag == false)
				div++;
			else {
				res *= div;
				flag = false;
			}
		}
		return res;
	}

}
