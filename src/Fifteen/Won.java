package Fifteen;

public class Won {
    public static boolean mWon(int[][] array) {
        int mCounter = 0;
        int[] mArray = new int[array.length * array.length];
        for (int i =0; i < array.length; i++) {
            for ( int j = 0; j < array.length; j++) {
                mArray[mCounter] = array[i][j];
                mCounter++;
            }
        }
            for (int i = 0; i < mArray.length-2; i++) {
                if (mArray[i] >= mArray[i + 1]) {
                    return false;
                }else if (mArray[mArray.length - 1] != 0) {
                        return false;
                }
            }
        System.out.println("You WIN!!!");
        return true;
    }
}
