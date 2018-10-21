/* Solution to project Euler problem 301.
 * 
 */
public class NimSolve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lossCount=0; 
		for(int i=1; i<=1073741824; i++) {
			if(currentLoss(i, 2*i, 3*i)) {
				lossCount++; 
			}
		}
		System.out.println(lossCount);
	}
	
	/* Checks if the current player loses if the three heaps have the passed values. 
	 * Current player loses if the sum of the three numbers in binary without carried digits is 0. 
	 * Returns true if current player will lose
	 */
	public static boolean currentLoss(long h1, long h2, long h3) { 
		boolean[] heap1=binary(h1);
		boolean[] heap2=binary(h2); 
		boolean[] heap3=binary(h3); 
		for(int i=0; i<32; i++) {
			if(exOr(heap1[i], exOr(heap2[i], heap3[i]))) {
				return true; 
			}
		}
		return false; 
	}
	/* returns a boolean array representing the binary representation of the passed decimal number, where 
	 * true represents 1 and false represents 0. 
	 * Precondition: passed number is less than 2^32 (always true in this program). 
	 * 
	 */
	public static boolean[] binary(long decimal) {
		boolean[] result=new boolean[32]; 
		for(int i=31; i>=0; i--) {
			if(decimal>=Math.pow(2, i)) {
				result[31-i]=true;
				decimal-=(Math.pow(2, i));
			}
			else {
				result[31-i]=false; 
			}
		}
		return result; 
	}
	/*
	 * Exclusive Or. Takes two boolean variables as arguments and returns true if exactly oen of them is true. 
	 */
	public static boolean exOr(boolean first, boolean second) {
		return (!first==second);
	}
}
