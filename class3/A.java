
package class3;

public class A implements Runnable{
    Thread t;
    A(){
        t = new Thread(this,"Class A");
        //t.run();
    }
    @Override
    public void run() {
        try{
            for(int i=0;i<10;i++){
                System.out.println(i);
                Thread.sleep(600);
            }
            
            //B b = new B();
            //b.run();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Thread A is Complete");
    }
    
}
