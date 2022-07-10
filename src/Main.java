import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("");
        MyThread thread1 = new MyThread(threadGroup, "1");
        MyThread thread2 = new MyThread(threadGroup, "2");
        MyThread thread3 = new MyThread(threadGroup, "3");
        MyThread thread4 = new MyThread(threadGroup, "4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        threadGroup.interrupt();

    }
}
