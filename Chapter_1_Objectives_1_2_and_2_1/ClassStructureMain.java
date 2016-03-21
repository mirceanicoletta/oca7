import oca7.Car;

/*
	Build this file using the command 'javac ClassStructureMain.java'
	Run this program using the command 'java ClassStructureMain'
	Note: 'javac ClassStructureMain.java' will compile the Car dependency class as well as the
	      main class
	RESULTS
	Car: Alfa Romeo, 100, black
*/

public class ClassStructureMain {

	public static void main(String[] args) {
		Car c = new Car("Alfa Romeo", 100, "black");
		System.out.println(c.toString());
	}
}
