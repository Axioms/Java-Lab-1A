

import java.util.Arrays;
import java.util.Random;

public class Lab1AArray {
    public static void main (String[] args) {

        int[] nums = {1, 4, 13, 43, -25, 17, 22, -37, 29};
        int[] data = new int[20];
        int numsLarge, dataLarge;

        data = fillRand(data);

        numsLarge = findLargest(nums);
        dataLarge = findLargest(data);

        System.out.println("nums' largest number is " +  numsLarge);
        System.out.println("Data's largest number is " + dataLarge);
        System.out.println("The sum of the largest numbers is " + (numsLarge + dataLarge));
        System.out.println("Data contains " + Arrays.toString(data));
        System.out.println("longest continuous series of positive numbers for data: " + positiveSeriesLen(data));
    }

    public static int findLargest (int[] nums) {

        int currentLargest = nums[0];

        for (int i=0; i < nums.length; i++) {
            if (nums[i] > currentLargest) {
                currentLargest = nums[i];
            }
        }
        return currentLargest;
    }

    public static int[] fillRand (int[] data) {

        Random rnd = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = rnd.nextInt(200 + 1) - 100;
        }
        return data;
    }

    public static int positiveSeriesLen(int[] data) {

        int cnt = 0;
        int largestCnt = 0;

        for (int i=0; i < data.length; i++) {
            if (data[i] > 0) {
                cnt++;
                if(largestCnt < cnt) {
                    largestCnt = cnt;
                }
            }
            else {
                cnt = 0;
            }
        }
        return largestCnt;
    }
}
