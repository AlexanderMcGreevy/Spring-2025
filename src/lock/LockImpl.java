package src.lock;

public class LockImpl implements IDialLock{
    int secret1, secret2, secret3;
    int input1, input2, input3;
    int tick;

    public LockImpl(int s1, int s2, int s3) {

        this.secret1 = s1;
        this.secret2 = s2;
        this.secret3 = s3;
    }
    /**
     * reset the ticlk to 0
     */
    @Override
    public void reset() {
        secret1=0;
        secret2=0;
        secret3=0;

        input1=0;
        input2=0;
        input3=0;

        tick=0;

    }

    /**
     * turn left by ticks
     *
     * @param ticks
     */
    @Override
    public void left(int ticks) {

    }

    /**
     * turn right by ticks
     *
     * @param ticks
     */
    @Override
    public void right(int ticks) {

    }

    /**
     * return the current tick
     *
     * @return
     */
    @Override
    public int currentTick() {
        return tick;
    }

    /**
     * Tests to see if the lock is open/
     *
     * @return
     */
    @Override
    public boolean pull() {
        return false;
    }
}
