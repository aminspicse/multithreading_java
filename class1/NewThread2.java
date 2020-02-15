package class1;
import java.util.logging.Level;
import java.util.logging.Logger;
public class NewThread2 implements Runnable{
    Thread t;
    NewThread2(){
        t=new Thread(this,"New Thread 2");
        t.run();
    }
    public void run(){
        for(int i=50;i>=1;i--){
            try {
                System.out.println(i);
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(NewThread2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
