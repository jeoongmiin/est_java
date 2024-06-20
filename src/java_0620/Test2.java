package java_0620;

public class Test2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(1));
        Thread thread2 = new Thread(new MyRunnable(2));
        Thread thread3 = new Thread(new MyRunnable(3));
        Thread thread4 = new Thread(new MyRunnable(4));
        Thread thread5 = new Thread(new MyRunnable(5));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}