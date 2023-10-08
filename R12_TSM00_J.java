class Base {
  public synchronized void doSomething() {
    // ...
  }
}
 
class Derived extends Base {
  @Override public void doSomething() {
    // ...
  }
}
