package class1;
import java.util.logging.Level;
import java.util.logging.Logger;
import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte0.runnable;
public class NewThread implements Runnable {
    Thread t;
    NewThread(){
        t= new Thread(this,"New Thread");
        t.run();
    }
    @Override
    public void run() {
        for(int i=0;i<50;i++){
            try {
                System.out.println(i);
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
