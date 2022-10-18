package algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SlidingWindow {
    public static void main(String[] args) {
    }

    // get the sum of the first n integers
    // the sliding window basically moves to the next item and leaves the first item
    // |`````| before
    // 1, 2, 3, 4, 5
    //    |     | after
    //    |_____|

    static int maxSubArraySum(int[] numbers, int n) {
        var maxSum = 0;
        for (int i = 0; i < n; i++) {
            maxSum += numbers[i];
        }

        var newSum = maxSum; // this will serve as the previous sum used to move the window
        for (int i = n; i < numbers.length; i++) {
             newSum = maxSum - numbers[i - n] + numbers[i];
             maxSum = Math.max(newSum,maxSum); // this is just to assign the max sum to the highest value
        }

        return numbers.length == 0 ? null : maxSum;
    }


    static boolean isSubsequence(String substr, String str){
        if (substr.length() == 0) return true; // empty string is a sub string of any string
        int j = 0;
        for (int i= 0; i < str.length(); i++){
            if(substr.charAt(j) == str.charAt(i)){
                if(++j == substr.length()) return true;
            }else{
                j = substr.charAt(0) == str.charAt(i) ? 1 : 0;
            }
        }
        return false;
    }
}
