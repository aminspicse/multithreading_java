
package class3;

public class B implements Runnable{
    Thread t;
    B(){
        t = new Thread(this,"Thread B");
        ///t.run();
    }

    @Override
    public void run() {
        System.out.println("Thread B is Started");
        try{
            for(int i=9;i>0;i--){
                System.out.println(i);
                Thread.sleep(600);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
