import java.util.ArrayList;

/**
 * ThreadCheckArray class that implements Runnable and checks an ArrayList<Integer>.
 */
public class ThreadCheckArray implements Runnable {
    private boolean flag;
    private boolean[] winArray;
    private SharedData sd;

    /**
     * Constructor to initialize the ThreadCheckArray with a SharedData object.
     *
     * @param sd The shared data object containing array, b, and other necessary information.
     */
    public ThreadCheckArray(SharedData sd) {
        this.sd = sd;
        synchronized (sd) {
            ArrayList<Integer> arrayList = sd.getArray();
            int size = arrayList.size();
            array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = arrayList.get(i);
            }
            b = sd.getB();
        }
        winArray = new boolean[array.length];
    }

    /**
     * Recursive method to check if the sum of a subset of the array equals b.
     *
     * @param n The current index in the array.
     * @param b The target sum.
     */
    void rec(int n, int b) {
        synchronized (sd) {
            if (sd.getFlag()) return;
        }
        if (n == 1) {
            if (b == 0 || b == array[n - 1]) {
                flag = true;
                synchronized (sd) { sd.setFlag(true); }
            }
            if (b == array[n - 1]) winArray[n - 1] = true;
            return;
        }

        rec(n - 1, b - array[n - 1]);
        if (flag) winArray[n - 1] = true;
        synchronized (sd) {
            if (sd.getFlag()) return;
        }
        rec(n - 1, b);
    }

    @Override
    public void run() {
        if (array.length != 1) {
            if (Thread.currentThread().getName().equals("thread1"))
                rec(array.length - 1, b - array[array.length - 1]);
            else
                rec(array.length - 1, b);
        }
        if (array.length == 1) {
            if (b == array[0] && !flag) {
                winArray[0] = true;
                flag = true;
                synchronized (sd) { sd.setFlag(true); }
            }
        }
        if (flag) {
            if (Thread.currentThread().getName().equals("thread1"))
                winArray[array.length - 1] = true;
            synchronized (sd) { sd.setWinArray(winArray); }
        }
    }

    private int[] array; // Changed from ArrayList<Integer> to int[]
    private int b;
}
