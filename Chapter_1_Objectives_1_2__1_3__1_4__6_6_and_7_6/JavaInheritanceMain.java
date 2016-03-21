import car.Volvo;
/*
	Compile the gile using the command 'javac JavaInheritanceMain.java'
	Run the binary file using the command 'java JavaInheritanceMain'
	RESULTS:
	The car is accelerating.
	The care was stopped.
	The lights are turned on.
	
*/

public class JavaInheritanceMain {
	public static void main (String[] args) {
		Volvo v = new Volvo();
		v.accelerate();	
		v.breakTheCar();
		v.turnOnTheLights();
	}
}
