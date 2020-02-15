
package class3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class InterThreadCommunication {
    public static void main(String arg[]){
        A ob1 = new A();
        B ob2 = new B();
        ob1.t.start();
        ob2.t.start();
        System.out.println(ob1.t.isAlive());
        try {
            ob1.t.join();
            ob2.t.join();
            
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(InterThreadCommunication.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(ob1.t.isAlive());
        System.out.println("");
    }
}
