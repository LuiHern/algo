package java.validateSubsequence;

import java.util.*;

class Program {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrPointer = 0;
        int seqPointer = 0;
        while (arrPointer < array.size() && seqPointer < sequence.size()) {
            if (array.get(arrPointer).equals(sequence.get(seqPointer))) {
                seqPointer++;
            }
            arrPointer++;
        }
        return seqPointer == sequence.size();
    }
}
