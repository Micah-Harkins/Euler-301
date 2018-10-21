/* Solution to project Euler problem 301. 
 * Micah Harkins
 */
public class NimSolve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lossCount=0; 
		for(int i=1; i<=1073741824; i++) {
			if(currentLoss(i, 2*i, 3*i)) {
				lossCount++; 
				System.out.println(i);
			}
		}
		System.out.println(lossCount);
	}
	
	/* Checks if the current player loses if the three heaps have the passed values. 
	 * Current player loses if the sum of the three numbers in binary without carried digits is 0. 
	 * Returns true if current player will lose. Java has built in xor, which is sum without carried digits
	 */
	public static boolean currentLoss(long h1, long h2, long h3) { 
		if((h1^h2^h3)==0) {
			return true; 
		}
		return false; 
	}


}
