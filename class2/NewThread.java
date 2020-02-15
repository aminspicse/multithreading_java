
package class2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NewThread extends Thread{
    NewThread(){
        super();
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
