import java.util.*;

class Program {

    public int[] sortedSquaredArray(int[] array) {
        int[] squared = new int[array.length];
        for (int elem = 0; elem < array.length; elem++) {
            int value = array[elem];
            squared[elem] = value * value;
        }
        Arrays.sort(squared);
        return squared;
    }
}