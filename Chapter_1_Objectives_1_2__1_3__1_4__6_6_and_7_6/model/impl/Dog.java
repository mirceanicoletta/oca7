package model.impl;

import model.Animal;

public class  Dog implements Animal {
	public void walk() {
		System.out.println("The dog is running.");
	}
	public void makeSound() {
		System.out.println("The dog sounds like 'HAM, HAM'.");
	}
}

