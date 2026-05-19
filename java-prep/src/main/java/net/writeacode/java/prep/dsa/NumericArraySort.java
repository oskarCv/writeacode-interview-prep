package net.writeacode.java.prep.dsa;

import java.util.List;

public class NumericArraySort {
    public void sortZeros(int[] nums){
        //push zero to the end
        // [1,0,2,3,0,4,5,0]
        // set an index where the 1st 0 is found
        // set a second index on the next position from the initial index
        //    while(indexB == 0)
        //       move the index one
        //    change the number between indexA and indexB

        for(int i = 0; i<nums.length -1; i++) {
            if (nums[i] == 0) {
                int indexB = i + 1;
                while (nums[indexB] == 0 && indexB < nums.length -1) {
                    indexB++;
                }
                nums[i] = nums[indexB];
                nums[indexB] = 0;
            }
        }
        for(int i=0; i<nums.length; i++){
            System.out.println("nums > "+ nums[i]);
        }
    }
}
