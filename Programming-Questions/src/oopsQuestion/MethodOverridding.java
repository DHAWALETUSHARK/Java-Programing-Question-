package oopsQuestion;

class Parent {
    void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child show()");
    }
}

public class MethodOverridding {

	public static void main(String[] args) {
		Parent p = new Child();
		p.show();
	}

}
