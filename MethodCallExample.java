/* #Day1OfDSAlgo
 *  1.Need to learn memory areas to know how exactly the data structures 
 *  are stored in memory
 *  2.objects are stored in heap memory
 *  3.local variables and references are stored in stack memory
 *  4.global variables are stored in method area
 *  5.Every thread as its own stack 
 *  4.Method calls are stored in stack memory
 *  5.Every method calls has an activation record in stack
 *  6.Activation record destroys after method call completes
 *  7.Stack gets destroyed after all the method calls are completed  */
public class MethodCallExample {
	public static void main(String args[])
	{
		m1();
	}

	private static void m1() {
		// TODO Auto-generated method stub
		int a;
		m2();
	}

	private static void m2() {
		// TODO Auto-generated method stub
		int b;
		m3();
		m4();
	}

	private static void m4() {
		// TODO Auto-generated method stub
		int c;
		
	}

	private static void m3() {
		// TODO Auto-generated method stub
		int d;
	}
}
