class MyThread extends Thread {


    public MyThread(ThreadGroup threadGroup, String s) {
        super(threadGroup, s);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Поток " + Thread.currentThread().getName() + " Всем привет!");
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.printf("%s завершен\n", "Поток " + getName());
        }
    }
}