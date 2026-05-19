package net.writeacode.java.prep.dsa;

import java.util.HashSet;

public class DuplicateNumbers {
    public boolean isDuplicate(int []nums){
        var numSet = new HashSet<Integer>(); //space On
        for(int i=0;i < nums.length;i++){ // time On
            if(numSet.contains(nums[i])){
                return true;
            }
            numSet.add(nums[i]);
        }
        return false;
    }
}
