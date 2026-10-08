class Parent {
	void printParentStatement() {
		System.out.println("This statement is from the Parent class.");
	}
}

class Child extends Parent {
	void printChildStatement() {
		System.out.println("This statement is from the Child class.");
	}
}

class GrandChild extends Child {
	void printGrandChildStatement() {
		System.out.println("This statement is from the GrandChild class.");
	}

	public static void main(String[] args) {
		GrandChild object = new GrandChild();
		object.printParentStatement();
		//object.printChildStatement();
		//object.printGrandChildStatement();
	}
}
 