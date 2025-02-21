package src.lock;
//This class is wrong, include the correct implementation in the LockImpl class
public class LockTest {
    public static void main(String[] args) {
        LockImpl lock = new LockImpl(10, 25, 15);

        lock.right(10);    // Moves to 10
        lock.left(25);     // Moves to 25
        lock.right(15);    // Moves to 0

        System.out.println(lock.pull()); // Should print true if the lock is open
    }
}
