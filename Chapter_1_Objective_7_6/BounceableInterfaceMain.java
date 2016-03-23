/*
	Build the file using the command "javac BounceableInterfaceMain.java"
	Run the binary file using the command "java BounceablewInterfaceMain"
	RESULTS
	Bouncing.
	Bouncing factor set to7
*/
import oca7.Tire;
import oca7.Bounceable;
public class BounceableInterfaceMain {
	public static void main(String[] args){
		Bounceable b = new Tire();
		b.bounce();
		b.setBounceFactor(7);
	}
}
