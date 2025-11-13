package Labsheet5;
// Task 3: Demonstrate access modifiers (private, protected, public) in same package
class ParentAccess {
    private String privateField = "private";
    protected String protectedField = "protected";
    public String publicField = "public";
    String defaultField = "default"; // package-private

    private void privateMethod() { System.out.println("Parent: privateMethod"); }
    protected void protectedMethod() { System.out.println("Parent: protectedMethod"); }
    public void publicMethod() { System.out.println("Parent: publicMethod"); }
    void defaultMethod() { System.out.println("Parent: defaultMethod"); }
}

public class Task3_AccessModifiers {
    static class ChildAccess extends ParentAccess {
        public void showAccess() {
            // privateField and privateMethod are NOT accessible here
            // System.out.println(privateField); // compile error
            System.out.println(protectedField); // accessible
            System.out.println(publicField); // accessible
            System.out.println(defaultField); // accessible because same package
            protectedMethod();
            publicMethod();
            defaultMethod();
        }
    }

    public static void main(String[] args) {
        ChildAccess c = new ChildAccess();
        c.showAccess();
    }
}
