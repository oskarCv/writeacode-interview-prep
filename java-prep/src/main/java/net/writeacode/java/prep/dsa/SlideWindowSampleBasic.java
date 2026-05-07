package net.writeacode.java.prep.dsa;

public class SlideWindowSampleBasic {
    /**
     * This Sample contains the most basic Slide Window Implementation
     * this is when we have an array and a know sub-array window which is commonly called k
     * and the data is in an integer form
     *
     * Commonly used to:
     *  - get the max Sum
     *  - get the max Product
     *  of an array given k sub-array
     *
     *  the Idea behind the sliding window is:
     *      1) to calculate the initial window
     *      2) to remove the tail item by usng the opocite operation
     *      3) to add the new leading item
     *
     * This approach lead us into a On complexity algorithm
     *
     */

    public void maxSum(int []nums, int k){
        int sum = 0;
        int currentSum = sum;
        int indexA = -1;
        int indexB = -1;

        //first window
        for(int i = 0; i < k; i++){
            currentSum += nums[i];
        }
        if(currentSum > sum){
            sum = currentSum;
            indexA = 0;
            indexB = k-1;
        }

        for(int i = 0; i < nums.length - k; i++){
            currentSum -= nums[i];
            currentSum += nums[k+i];
            if(currentSum > sum){
                sum = currentSum;
                indexA = i+1;
                indexB = k+i;
            }
        }
        System.out.println("sum: "+ sum);
        System.out.println("indexA: "+ indexA);
        System.out.println("indexB: "+ indexB);
    }
    public void maxProduct(int []nums, int k){
        int maxProduct = 1;
        int currentProduct = maxProduct;
        int indexA = 0;
        int indexB = 0;
        // get product of the 1st window
        for(int i = 0; i < k; i++){
            currentProduct *= nums[i];
        }
        if(currentProduct > maxProduct){
            maxProduct = currentProduct;
        }

        //move the window along the data set  - k
        for(int i=0; i<nums.length-k; i++){
            // to remove an item from the window we use the contrary operation
            currentProduct /= nums[i]; //removing the tail item
            currentProduct *= nums[k+i]; //adding the leading item

            if(currentProduct > maxProduct){
                maxProduct = currentProduct;
                indexA = i+1;
                indexB = i+k;
            }
        }
        System.out.println("Max product >>> "+ maxProduct);
        System.out.println("Index A >>> "+indexA);
        System.out.println("Index B >>> "+indexB);
    }
}
