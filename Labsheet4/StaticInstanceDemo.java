public class StaticInstanceDemo {
    static int staticVar = 10;
    int instanceVar = 20;

    public static void main(String[] args) {
        StaticInstanceDemo obj1 = new StaticInstanceDemo();
        StaticInstanceDemo obj2 = new StaticInstanceDemo();

        obj1.instanceVar = 50;
        StaticInstanceDemo.staticVar = 100;

        System.out.println("obj1 instanceVar: " + obj1.instanceVar);
        System.out.println("obj2 instanceVar: " + obj2.instanceVar);
        System.out.println("StaticVar: " + StaticInstanceDemo.staticVar);
    }
}