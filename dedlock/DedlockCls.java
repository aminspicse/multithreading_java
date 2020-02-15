package dedlock;

/**
 *
 * @author AL AMIN
 */
public class DedlockCls implements Runnable{
    A a = new A();
    B b = new B();
    Thread t;
    DedlockCls(){
        t = new Thread(this,"Dedlock");
    }
    void dedlockstart(){
        t.start();
        a.foo(b);
        System.out.println("Back main thread");
    }
    @Override
    public void run() {
        b.bar(a);
        System.out.println("Back in other thread");
    }
    
    public static void main(String arg[]){
        DedlockCls d = new DedlockCls();
        d.dedlockstart();
    }

}
