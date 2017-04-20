package Fifteen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Draw {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int mMax = Integer.parseInt(reader.readLine());
        int mCount = mMax * mMax-1;
        int[][] mArray = new int[mMax][mMax];
        Move move = new Move();
        for (int i = 0; i < mMax; i++) {
            for (int j = 0; j < mMax; j++) {
                mArray[i][j] = mCount;
                mCount--;
            }
        }
        if (mMax % 2 == 0) {
            mArray[mArray.length-1][mArray.length - 2] = 2;
            mArray[mArray.length-1][mArray.length - 3] = 1;
        }
        mPrint(mArray);
        while(!Won.mWon(mArray)){
            System.out.println();
            mArray = Move.mMove(mArray);
            mPrint(mArray);
        }
    }

    public static void mPrint(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array.length; j++ ) {
                if (array[i][j] != 0) {
                    if (array[i][j] < 10) {
                        System.out.print(" " + array[i][j] + " ");
                    }else System.out.print(array[i][j] + " ");
                } else System.out.print(" _ ");
            }
        }
    }
}
