/*
    Thread Programm extending Thread Class;
*/
package class2;
public class MainClass{
   
    public static void main(String[] arg){
        NewThread n = new NewThread();
        n.setName("Prectic New Thread");
        n.start();
    }
}
