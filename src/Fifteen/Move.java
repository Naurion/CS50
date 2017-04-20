package Fifteen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Move {
    public static int[][] mMove(int[][] array) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int mValue = 0;
        try {
            mValue = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Integer need");
        } catch (IOException e) {
            e.printStackTrace();
        }
        int mIVal = 0, mJVal = 0;
        for (int i = 0; i < array.length;i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == mValue) {
                    mIVal = i;
                    mJVal = j;
                }
            }
        }


//Top border
        if (mIVal == 0 && (mJVal != 0 && mJVal != array.length - 1)) {
            if (array[mIVal][mJVal + 1] == 0) {
                array[mIVal][mJVal + 1] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            } else if (array[mIVal][mJVal - 1] == 0) {
                array[mIVal][mJVal - 1] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            } else if (array[mIVal + 1][mJVal] == 0) {
                array[mIVal + 1][mJVal] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            }
        }
//Bottom border
        else if (mIVal == array.length - 1 && (mJVal != 0 && mJVal != array.length - 1)) {
            if (array[mIVal][mJVal + 1] == 0) {
                array[mIVal][mJVal + 1] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            } else if (array[mIVal][mJVal - 1] == 0) {
                array[mIVal][mJVal - 1] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            } else if (array[mIVal - 1][mJVal] == 0) {
                array[mIVal - 1][mJVal] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            }
        }
//Left border
        else if (mJVal == 0  && (mIVal != 0 && mIVal != array.length - 1)) {
            if (array[mIVal][mJVal + 1] == 0) {
                array[mIVal][mJVal + 1] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            } else if (array[mIVal + 1][mJVal] == 0) {
                array[mIVal + 1][mJVal] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            } else if (array[mIVal - 1][mJVal] == 0) {
                array[mIVal - 1][mJVal] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            }
        }
//Right border
        else if (mJVal == array.length - 1  && (mIVal != 0 && mIVal != array.length - 1)) {
            if (array[mIVal][mJVal - 1] == 0) {
                array[mIVal][mJVal - 1] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            } else if (array[mIVal + 1][mJVal] == 0) {
                array[mIVal + 1][mJVal] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            } else if (array[mIVal - 1][mJVal] == 0) {
                array[mIVal - 1][mJVal] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            }
        }

//Left up corner
        else if (mIVal == 0 && mJVal == 0) {
            if (array[mIVal][mJVal + 1] == 0) {
                array[mIVal][mJVal + 1] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            } else if (array[mIVal + 1][mJVal] == 0) {
                array[mIVal + 1][mJVal] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            }
        }

//Right up corner
        else if (mIVal == 0 && mJVal == array.length - 1) {
            if (array[mIVal][mJVal - 1] == 0) {
                array[mIVal][mJVal - 1] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            } else if (array[mIVal + 1][mJVal] == 0) {
                array[mIVal + 1][mJVal] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            }
        }

//Left down corner
        else if (mIVal == array.length - 1 && mJVal == 0) {
            if (array[mIVal][mJVal + 1] == 0) {
                array[mIVal][mJVal + 1] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            } else if (array[mIVal - 1][mJVal] == 0) {
                array[mIVal - 1][mJVal] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            }
        }

//Right down corner
        else if (mIVal == array.length - 1 && mJVal == array.length - 1) {
            if (array[mIVal][mJVal - 1] == 0) {
                array[mIVal][mJVal - 1] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            } else if (array[mIVal - 1][mJVal] == 0) {
                array[mIVal - 1][mJVal] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            }
        }
//Centre
        else {
            if (array[mIVal][mJVal + 1] == 0) {
                array[mIVal][mJVal + 1] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            } else if (array[mIVal + 1][mJVal] == 0) {
                array[mIVal + 1][mJVal] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            } else if (array[mIVal - 1][mJVal] == 0) {
                array[mIVal - 1][mJVal] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            } else if (array[mIVal][mJVal - 1] == 0) {
                array[mIVal][mJVal - 1] = array[mIVal][mJVal];
                array[mIVal][mJVal] = 0;
            }
        }
        return array;
    }
}
