// Bitwise Program to swap two numbers without using a temporary variable
class SwapNumbers{
	public static void main(String[] args) {
		int x = 8, y = 10;
		System.out.println ("The Given Numbers are x = " + x ) ;
		System.out.println ("The Given Numbers are y = " + y ) ;
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println ("The Swapped Numbers are x = " + x );
		System.out.println ("The Swapped Numbers are y = " + y );
		
		
	}
}