class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int max=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max){
                sec=max;
                max=i;
            }
            else if(i>sec && i<max){
                sec=i;
            }
        }
        return sec==Integer.MIN_VALUE?-1:sec;
    }
