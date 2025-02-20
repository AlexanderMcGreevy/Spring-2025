// src/lock/LockImpl.java
package src.lock;


public class LockImpl implements IDialLock {
    int secret1, secret2, secret3;
    int input1, input2, input3;
    int tick;

    public LockImpl(int s1, int s2, int s3) {
        this.secret1 = s1;
        this.secret2 = s2;
        this.secret3 = s3;
    }

    @Override
    public void reset() {
        secret1 = 0;
        secret2 = 0;
        secret3 = 0;
        input1 = 0;
        input2 = 0;
        input3 = 0;
        tick = 0;
    }

    @Override
    public void left(int ticks) {
        this.tick -= ticks;
        if (this.tick < 0) {
            this.tick = 40 + this.tick;
        }
    }

    @Override
    public void right(int ticks) {
        this.tick = (this.tick + ticks) % 40;
    }

    @Override
    public int currentTick() {
        return tick;
    }

    @Override
    public boolean pull() {
        return secret1 == input1 && secret2 == input2 && secret3 == input3;
    }

    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public void setInput2(int input2) {
        this.input2 = input2;
    }

    public void setInput3(int input3) {
        this.input3 = input3;
    }
}