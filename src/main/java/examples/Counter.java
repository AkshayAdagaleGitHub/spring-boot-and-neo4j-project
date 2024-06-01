package examples;

public class Counter implements Runnable {
    @Override
    public void run() {
        synchronized (this) {
            this.increment();
            System.out.println("Value for Thread after incrementing " + Thread.currentThread().getName()
                    + " " + this.getValue());
            this.decrement();
            System.out.println("Value for Thread after decrementing " + Thread.currentThread().getName()
                    + " " + this.getValue());
        }
    }

    private int c = 0;

    public void increment() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            //Auto-generated catch block
            e.printStackTrace();
        }
        c++;
    }

    public void decrement() {
        c--;
    }

    public int getValue() {
        return c;
    }
}
