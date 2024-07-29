public class Main {
  public static void main(String[] args) {
    Counter c = new Counter();

    Thread t1 = new Thread(new CountUp(c));
    Thread t2 = new Thread(new CountDown(c));

    t1.start();

    try {
      t1.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    t2.start();
  }
}
