package algorithms;

import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(averagePair(new double[]{2,3,4},2.5)));
        System.out.println(Arrays.toString(sumZero(new int[]{-2,-1,0,1,3,3,4,4,5})));
        System.out.println(countUniqueValues(new int[]{}));
    }

    static double[] averagePair(double[] numbers, double average) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            var avg = (numbers[start] + numbers[end]) / 2;
            if (avg > average) end--;
            else if (avg < average) start++;
            else return new double[]{numbers[start], numbers[end]};
        }
        return null;
    }

    static int[] sumZero(int[] numbers) {
        int start = 0;
        int end = numbers.length -1;
        while(start < end) {
            var sum = numbers[start] + numbers[end];
            if(sum > 0) end--;
            else if(sum < 0) start++;
            else return new int[]{numbers[start],numbers[end]};
        }
        return null;
    }

    static int countUniqueValues(int[] numbers){
        var count = 0;
        for(int i = 1; i < numbers.length; i++){
            if (numbers[i] != numbers[count]){
                count++;
                numbers[count] = numbers[i];
            }
        }
        return numbers.length == 0 ? 0 : count+1;
    }
}
