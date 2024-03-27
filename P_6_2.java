// Krisha Zalavadiya
// 220130318058
package b;
import a.P_6_1;

public class P_6_2 extends P_6_1 {
    
    protected void printMessage() {
        System.out.println("World");
    }

    
    public void fun() {
        printMessage();
    }

    public static void main(String[] args) {
        P_6_1 p1 = new P_6_1();
        p1.fun();
        P_6_2 p2 = new P_6_2();
        p2.fun();
    }
}
