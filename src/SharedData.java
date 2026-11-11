import java.util.ArrayList;

/**
 * SharedData class containing shared data and utilities.
 */
public class SharedData {
    private ArrayList<Integer> array;
    private boolean[] winArray;
    private boolean flag;
    private final int b;

    /**
     * Constructor to initialize the SharedData object with an array and a value for b.
     *
     * @param array The initial integer array.
     * @param b     A constant integer value.
     */
    public SharedData(int[] array, int b) {
        this.array = new ArrayList<>();
        for (int i : array) {
            this.array.add(i);
        }
        this.b = b;
        // Initialize winArray with the same size as array
        this.winArray = new boolean[this.array.size()];
    }

    /**
     * Getter for winArray.
     *
     * @return The winArray of type {@code boolean[]}.
     */
    public boolean[] getWinArray() {
        return winArray;
    }

    /**
     * Setter for winArray.
     *
     * @param winArray The new value for the winArray of type {@code boolean[]}.
     */
    public void setWinArray(boolean[] winArray) {
        this.winArray = winArray;
    }

    /**
     * Getter for array.
     *
     * @return The array of type {@code ArrayList<Integer>}.
     */
    public ArrayList<Integer> getArray() {
        return array;
    }

    /**
     * Getter for b.
     *
     * @return The value of b as an integer.
     */
    public int getB() {
        return b;
    }

    /**
     * Getter for flag.
     *
     * @return The current value of the flag as a boolean.
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * Setter for flag.
     *
     * @param flag The new value to set for the flag as a boolean.
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
