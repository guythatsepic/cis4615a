// Rule 12. Thread-Safety Miscellaneous (TSM)
// TSM00-J. Do not override thread-safe methods with methods that are not thread-safe

class Base {
  public synchronized void doSomething() {
    // ...
  }
}
 
class Derived extends Base {
  @Override public synchronized void doSomething() {
    // ...
  }
}
