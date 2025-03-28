package Easy;

public class PowerOfTwo {
	
	public static boolean powerOfTwo(int n) {
		
		if(n == 0) return false;
		
		while(n != 1) { // n is reduced to 1.
			if(n % 2 != 0) {
				return false;
			} else {
				n /= 2;
			}
		}
		return true;
	}
	
	public static void main(String[]args) {
		
		System.out.println(powerOfTwo(15));
		
	}

}

// https://www.youtube.com/watch?v=ta17SZ_t-_M