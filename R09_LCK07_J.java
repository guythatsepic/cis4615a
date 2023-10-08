final class BankAccount implements Comparable<BankAccount> {
  private double balanceAmount;  // Total amount in bank account
  private final Object lock;
 
  private final long id; // Unique for each BankAccount
  private static final AtomicLong nextID = new AtomicLong(0); // Next unused ID
 
  BankAccount(double balance) {
    this.balanceAmount = balance;
    this.lock = new Object();
    this.id = nextID.getAndIncrement();
  }
 
  @Override public int compareTo(BankAccount ba) {
     return (this.id > ba.id) ? 1 : (this.id < ba.id) ? -1 : 0;
  }
 
  // Deposits the amount from this object instance
  // to BankAccount instance argument ba
  public void depositAmount(BankAccount ba, double amount) {
    BankAccount former, latter;
    if (compareTo(ba) < 0) {
      former = this;
      latter = ba;
    } else {
      former = ba;
      latter = this;
    }
    synchronized (former) {
      synchronized (latter) {
        if (amount > balanceAmount) {
          throw new IllegalArgumentException(
              "Transfer cannot be completed");
        }
        ba.balanceAmount += amount;
        this.balanceAmount -= amount;
      }
    }
  }
 
  public static void initiateTransfer(final BankAccount first,
    final BankAccount second, final double amount) {
 
    Thread transfer = new Thread(new Runnable() {
        @Override public void run() {
          first.depositAmount(second, amount);
        }
    });
    transfer.start();
  }
}
