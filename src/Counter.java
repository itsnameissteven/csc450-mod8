public class Counter {
  private int count = 0;

  public synchronized void increment() {
    count++;
  }

  public void decrement() {
    count--;
  }

  public int value() {
    return count;
  }
    
}

