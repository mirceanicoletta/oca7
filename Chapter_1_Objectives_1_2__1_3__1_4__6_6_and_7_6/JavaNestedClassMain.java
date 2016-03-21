/*	
	Compile this file using the command 'javac JavaNestedClassMain.java'
	Run the binary file using the command 'java JavaNestedClassMain'
	RESULTS:
	Motocycle:Yamaha, 100, red
*/
public class JavaNestedClassMain {
	private class Motocycle {
		private String name;
		private Integer power;
		private String color;
		public Motocycle(String _name, Integer _power, String _color) {
			this.name = _name;
			this.power = _power;
			this.color = _color;
		}
		
		public String toString() {
			return "Motocylce:" + this.name + ", " + this.power + ", " + this.color;
		}
	}
	private Motocycle m;
	public JavaNestedClassMain() {
		this.m = new Motocycle("Yamaha", 100, "red");
	}
	public Motocycle getMotocycle() {
		return this.m;
	}
	public static void main(String[] args) {
		JavaNestedClassMain jncm = new JavaNestedClassMain();
		System.out.println(jncm.getMotocycle().toString());
	}
}
