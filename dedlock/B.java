package dedlock;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AL AMIN
 */
public class B {
    synchronized void bar(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(B.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(name +" trying to call A.last()");
        a.last();
    }
    synchronized void last() {
        
    }
    
}
