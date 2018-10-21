/* Solution to project Euler problem 301.
 * 
 */
public class NimSolve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lossCount=0; 
		for(int i=0; i<1073741824; i++) {
			if(currentLoss(i, 2*i, 3*i)) {
				lossCount++; 
			}
		}
		System.out.println(lossCount);
	}
	
	/* Checks if the current player loses if the three heaps have the passed values. 
	 * Current player loses if the sum of the three numbers in binary without carried digits is 0. 
	 */
	public static boolean currentLoss(long h1, long h2, long h3) {
		boolean loss=false; 
		
		return loss; 
	}
	/* returns a boolean array representing the binary representation of the passed decimal number, where 
	 * true represents 1 and false represents 0. 
	 * 
	 */
	public static boolean[] binary(long decimal) {
		boolean[] result=new boolean[32]; 
		for(int i=31; i>=0; i++) {
			if(decimal>=Math.pow(2, i)) {
				result[32-i]=true;
				decimal-=(Math.pow(2, i));
			}
			else {
				result[32-i]=false; 
			}
		}
		return result; 
	}
}
