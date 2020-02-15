package class1;
public class Thread1 {
    public static void main(String[] args) {
        NewThread obj1 = new NewThread();
        NewThread2 obj2 = new NewThread2();
        new NewThread();
        new NewThread2();
        System.out.println("Thread Complete");
        System.out.println(obj1.getClass().getName());
        /*Thread t = new Thread();
        System.out.println(t.getName());
        
        t.setName("MD. AL AMIN");
        System.out.println(t.getName());
        // thread delay
        try{
            for(int i=0;i<6;i++){
                System.out.println(i);
                t.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        } */
    }
}
