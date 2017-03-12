package test;

/**
 * Created by Fisher on 2/3/2017.
 */
// I want to test when the jvm will exit
public class ThreadTest {

    public static void main(String[] args) {
        System.out.println("start");
//        new Thread(new ThreadTest1()).start();
        // what if the Thread is a daemon thread
        // thread's run will not be finished, because JVM exit before it completes
        Thread t = new Thread(new ThreadTest1());
        t.setDaemon(true);
        t.start();

        System.out.println("stop");
    }


    private static class ThreadTest1 implements Runnable{

        public void run() {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("running");
        }
    }

}
