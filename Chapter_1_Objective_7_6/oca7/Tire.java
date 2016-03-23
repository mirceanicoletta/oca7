package oca7;

import static java.lang.System.out;
public class Tire implements Bounceable {
	public void bounce(){
		out.println("Bouncing.");
	}
	public void setBounceFactor(int bf) {
		out.println("Bouncing factor set to" + bf);
	}
}
