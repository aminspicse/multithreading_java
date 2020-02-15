package dedlock;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AL AMIN
 */
public class A {
    synchronized void foo(B b){
        String name = Thread.currentThread().getName();
        System.out.println(name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Try to call b.last() method");
        b.last();
    }
    synchronized void last(){
        System.out.println("This method inside of class A");
    }
}
