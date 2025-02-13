package src.lock;

public interface IDialLock {
    /**reset the ticlk to 0
     *
     */
    void reset();

    /**turn left by ticks
     *
     * @param ticks
     */
    void left(int ticks);

    /**turn right by ticks
     *
     * @param ticks
     */
    void right(int ticks);

    /**return the current tick
     *
     * @return
     */
    int currentTick();

    /**Tests to see if the lock is open/
     *
     * @return
     */
    boolean pull();

}
