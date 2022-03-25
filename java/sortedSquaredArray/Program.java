package java.sortedSquaredArray;

import java.util.*;

class Program {

    // public int[] sortedSquaredArray(int[] array) {
    //     int[] squared = new int[array.length];
    //     for (int elem = 0; elem < array.length; elem++) {
    //         int value = array[elem];
    //         squared[elem] = value * value;
    //     }
    //     Arrays.sort(squared);
    //     return squared;
    // }

    public int[] sortedSquaredArray(int[] array) {
        int[] squared = new int[array.length];
        int leftPointer = 0;
        int rightPointer = array.length - 1;

        for (int i = array.length - 1; i >= 0; i--) {
            int leftValue = array[leftPointer];
            int rightValue = array[rightPointer];

            if (Math.abs(leftValue) > Math.abs(rightValue)) {
                squared[i] = leftValue * leftValue;
                leftPointer++;
            } else {
                squared[i] = rightValue * rightValue;
                rightPointer--;
            }
        }
        return squared;
    }
}