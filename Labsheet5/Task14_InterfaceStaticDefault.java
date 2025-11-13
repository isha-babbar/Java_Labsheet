package Labsheet5;
// Task 14: Interface with static and default methods
interface Util14 {
    static void helper() { System.out.println("Util14 helper static"); }
    default void greet() { System.out.println("Default greet from Util14"); }
}

public class Task14_InterfaceStaticDefault implements Util14 {
    public static void main(String[] args) {
        Util14.helper(); // call static method
        Task14_InterfaceStaticDefault obj = new Task14_InterfaceStaticDefault();
        obj.greet(); // call default method
    }
}
