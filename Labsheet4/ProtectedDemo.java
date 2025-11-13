class Parent {
    protected String name = "ParentName";
}

class Child extends Parent {
    public void display() {
        System.out.println("Name from parent: " + name);
    }
}

public class ProtectedDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}