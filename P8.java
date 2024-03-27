// Krisha Zalavadiya
// 220130318058
/*Write a program that illustrates interface inheritance. Interface P12 inherits from both P1 and P2. Each 
interface declares one constant and one method. The class Q implements P12. Instantiate Q and invoke each of 
its methods */
interface P1 {
    final int CONSTANT1 = 10;

    void method1();
}
interface P2 {
    final int CONSTANT2 = 20;

    void method2();
}
interface P12 extends P1, P2 {
}

class Q implements P12 {
    public void method1() {
        System.out.println("First number is :: " + CONSTANT1);
    }

    public void method2() {
        System.out.println("Second number :: " + CONSTANT2);
    }
}

public class P8 {
    public static void main(String[] args) {
        Q q = new Q();
        q.method1();
        q.method2();
    }
}
