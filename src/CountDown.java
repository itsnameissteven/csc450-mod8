public class CountDown implements Runnable{
  Counter counter;
  public CountDown(Counter counter) {
    this.counter = counter;
  }
  @Override
  public void run() {
    while (counter.value() > 0) {
      counter.decrement();
      System.out.println("Count down thread: " + counter.value());
    }
  }
}
