
public class ThreadP extends Thread {

    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(getName() + "  " + i);
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("" + ex);
            }
        }
    }

    public ThreadP(String name) {
        super(name);
        start();
    }
}

class Testor2 {

    public static void main(String[] args) throws InterruptedException {
        ThreadP ob = new ThreadP("thread1");
        ThreadP ob2 = new ThreadP("thread2");
        ThreadP ob3 = new ThreadP("thread1");
        ThreadP ob4 = new ThreadP("thread2");
//
//        ob.join();
//        ob2.join();
//        ob3.join();
//        ob4.join();
        
        System.out.println(""+ob.isDaemon());
        System.out.println(""+ob.isAlive());
        System.out.println(""+ob.isInterrupted());
        
        for (int i = 0; i < 10; i++) {

            System.out.println("Main" + i);
            Thread.sleep(100);
        }

        System.out.println("Main thread ends");
    }
}
