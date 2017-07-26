import java.lang.reflect.Method;

/**
 * 
 */

/**
 * @author Balwinder
 * 
 */
public class Test {

	interface METHODS {
		int USING_TERNANRY = 1;
		int USING_MODULUS = 2;
		int USING_SUBSTRACTION =3;
		int USING_XOR = 4;
		int USING_ARRAY = 5;

	}

	/**
	 * Write a function that accepts a positive integer number n and
	 *  outputs the following sequence:
	 *  n n-1 n-2 n-3 .. 1
	 *	n-1 n-2 n-3 ... 1
	 *	n-2 n-3 ... 1
	 *	n-3 ... 1
	 *	1
	 * @param n
	 */
	void loopMethod(int n) {

		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	/**
	 * using single loop
	 * 
	 * @param n
	 */
	void loopMethod3(int n) {
		int temp = n;
		for (int i = n; i >= 1; i--) {

			System.out.print(i + " ");
			if (i == 1) {
				System.out.println();
				temp = temp - 1;
				i = temp + 1;
			}
		}
	}

	/**
	 * 
	 * Using while loop
	 * 
	 * @param n
	 */
	void loopMethod2(int n) {
		int temp = n;
		do {
			System.out.print(n + " ");
			if (n == 1) {
				System.out.println();
				temp = temp - 1;
				n = temp;
			} else
				n = n - 1;

		} while (n >= 1);

	}

	/**
	 * Print using recursion
	 * 
	 * @param n
	 */
	void printUsingRecursion(int n) {

		if (n < 1)
			return;

		for (int x = n; x >= 1; x--) {
			System.out.print(x + " ");
		}
		System.out.print("\n");
		printUsingRecursion(n - 1);

	}

	/**
	 * Given a function that accepts either 0 or 1 as argument and returns 0 if 
	 * the input is 1 and 1 if the
	 *	input is 0:
	 * @param n
	 * @param method {@link METHODS}}
	 * @return
	 */
	int swapValue(int n , int method)
	{
		int value=-1;

		switch (method) {
		
		case METHODS.USING_TERNANRY:
			value = n==1?0:1;
			break;

		case METHODS.USING_SUBSTRACTION:
			value = 1-n ; 
			break;
			
		case METHODS.USING_MODULUS:
			value = ( n + 1 ) % 2;
            break;
			
			
		case METHODS.USING_XOR:
			value = n^1 ; 
			break;
			
			
		case METHODS.USING_ARRAY:
			int[] arr = {1,0};
			if(n<=1) //avoid array out of bound exception
			value = arr[n];
			break;
			
			
		default:
			break;
			
			
		}
		return value;
		
	}

	public static void main(String[] args) {
		Test testObj = new Test();
		
		System.out.println(testObj.swapValue(1, METHODS.USING_ARRAY));
		System.out.println("=========================");
		testObj.printUsingRecursion(10);

	}

}
