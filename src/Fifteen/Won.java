package Fifteen;

public class Won {
    public static boolean mWon(int[][] array) {
        int mCounter = 1;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i][j] != mCounter) {
                        return false;
                    }
                    mCounter++;
                }
            }
        return true;
    }
}
