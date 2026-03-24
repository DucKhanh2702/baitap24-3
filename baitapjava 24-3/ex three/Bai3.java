public class Bai3 {
    public static void main(String[] args) {
        WorkerThread t1 = new WorkerThread();
        t1.start();

        WorkerRunnable runnable = new WorkerRunnable();
        Thread t2 = new Thread(runnable);
        t2.start();
    }
}


class WorkerThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread dang chay...");
    }
}


class WorkerRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable dang chay...");
    }
}