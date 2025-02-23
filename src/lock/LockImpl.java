package src.lock;

public class LockImpl implements IDialLock {
    private final int secret1, secret2, secret3;
    private int tick1, tick2, tick3;  // Store the three input values

    public LockImpl(int s1, int s2, int s3) {
        if (s1 < 0 || s2 < 0 || s3 < 0) {
            throw new IllegalArgumentException("The secret digits cannot be negative");
        }
        this.secret1 = s1;
        this.secret2 = s2;
        this.secret3 = s3;
        reset();
    }

    @Override
    public void reset() {
        tick1 = 0;
        tick2 = 0;
        tick3 = 0;
    }

    @Override
    public void left(int ticks) {
        tick2 = (40 + ticks) % 40;  // Store as second number
    }

    @Override
    public void right(int ticks) {
        if (tick1 == 0) {
            tick1 = ticks % 40;  // Store as first number
        } else {
            tick3 = ticks % 40;  // Store as third number
        }
    }

    @Override
    public int currentTick() {
        return tick1;  // This can be modified based on user input tracking
    }

    @Override
    public boolean pull() {
        return tick1 == secret1 && tick2 == secret2 && tick3 == secret3;
    }

    @Override
    public String toString() {
        return "(" + secret1 + ", " + secret2 + ", " + secret3 + ")";
    }
}
