package net.writeacode.java.prep;

import net.writeacode.java.prep.dsa.SlideWindowSampleBasic;
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
    }
}
