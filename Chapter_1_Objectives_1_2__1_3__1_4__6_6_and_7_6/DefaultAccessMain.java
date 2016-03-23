/*
	Attemplt to complyle the file using the command 'javac DefaultAccessMain.java'
	RESULTS
	DefaultAccessMain.java:1: error: Beverage is not public in cert; cannot be accessed from outside package
	import cert.Beverage;
                    ^
	1 error
*/
import cert.Beverage;
public class DefaultAccessMain {
	public static void main (String[] args) {
		//Do something with the drink		
	}
}
