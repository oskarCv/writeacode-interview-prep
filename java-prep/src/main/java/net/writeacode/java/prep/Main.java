package net.writeacode.java.prep;

import net.writeacode.java.prep.dsa.*;
import net.writeacode.java.prep.strings.FindNumberOfVowels;

public class Main {
    static void main() {
        System.out.println("Java Prep");
        // VowelsCounter
        FindNumberOfVowels vowels = new FindNumberOfVowels();
        String str = "abcdefghijklmnopq"; //4
        System.out.println("Total Vowels: "+ vowels.getVowels(str));
        //Basic Window:
        SlideWindowSampleBasic basicSlideWindow = new SlideWindowSampleBasic();
        int []nums = {1,2,3,-4,5,6,7,0};
        int k =2;
        basicSlideWindow.maxSum(nums, k);
        basicSlideWindow.maxProduct(nums, k);

        NumericArraySort numericArraySort = new NumericArraySort();
        int [] numsToSort = {1,0,2,0,3,0,4,5,0,3,0,1,2,3,0,4,5};
        numericArraySort.sortZeros(numsToSort);

        DuplicateNumbers duplicateNumbers = new DuplicateNumbers();
        int []dupNumbers= {1,2,3,5,4,6,2,5};
        System.out.println("Contains Duplicates: "+ duplicateNumbers.isDuplicate(dupNumbers));

        int []numsSum = {11,15,2,7};
        int sumTarget = 9;
        TwoSum twoSum = new TwoSum();
        var indexSum = twoSum.twoSum(numsSum, sumTarget);
        System.out.println("Index Sum: "+ indexSum);
    }
}
