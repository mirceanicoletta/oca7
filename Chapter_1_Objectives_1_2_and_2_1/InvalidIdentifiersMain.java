/*
	Compile this file using the command 'javac InvalidIdentifiersMain.java'
	RESULTS:

InvalidIdentifiersMain.java:3: error: not a statement
		int :b;
		^
InvalidIdentifiersMain.java:3: error: ';' expected
		int :b;
		   ^
InvalidIdentifiersMain.java:3: error: not a statement
		int :b;
		     ^
InvalidIdentifiersMain.java:4: error: not a statement
		int -d;
		^
InvalidIdentifiersMain.java:4: error: ';' expected
		int -d;
		   ^
InvalidIdentifiersMain.java:4: error: not a statement
		int -d;
		     ^
InvalidIdentifiersMain.java:5: error: illegal character: \35
		int e#;
		     ^
InvalidIdentifiersMain.java:6: error: class expected
		int .f;
		     ^
InvalidIdentifiersMain.java:7: error: not a statement
		int 7g;
		^
InvalidIdentifiersMain.java:7: error: ';' expected
		int 7g;
		   ^
InvalidIdentifiersMain.java:7: error: not a statement
		int 7g;
		     ^
InvalidIdentifiersMain.java:8: error: not a statement
		int static;	
		^
InvalidIdentifiersMain.java:8: error: ';' expected
		int static;	
		   ^
InvalidIdentifiersMain.java:8: error: illegal start of expression
		int static;	
		    ^
14 errors

*/

public class InvalidIdentifiersMain{
	public static void main(String[] args) {
		int :b; // identifiers can only start with _, $ or a letter
		int -d; // identifiers can only start with _, $ or a letter
		int e#; // identifiers can only contain digits and letters after the first caracter
		int .f; // identifiers can only start with _, $ or a letter
		int 7g; // identifierrs can not start with a digit
		int static; // identifiers cannot be java keywords	
	}
}
