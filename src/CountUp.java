public class CountUp implements Runnable{
  Counter counter;
  public CountUp(Counter counter) {
    this.counter = counter;
  }
  @Override
  public void run() {
    while (counter.value() < 20) {
      counter.increment();
      System.out.println("Count up thread: " + counter.value());
    }
  }
}
