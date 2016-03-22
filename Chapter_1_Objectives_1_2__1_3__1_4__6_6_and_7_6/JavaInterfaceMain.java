import model.Animal;

import model.impl.Tiger;
import model.impl.Dog;
/*
	Complile this file using the command 'javc JavaInterfaceMain.java'
	Run the binary file using the command 'java JavaInterfaceMain'
	RESULTS:
	The tiger is waling
	The tiger is making sounds.
	The dog is running.
	The dog sounds like 'HAM, HAM'.
	
*/

public class JavaInterfaceMain {
	
	public static void main(String[] args) {
		Animal a;
		a = new Tiger();
		a.walk();
		a.makeSound();		
		a = new Dog();
		a.walk();
		a.makeSound();
		
	}
}
