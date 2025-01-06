class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        List<Integer>res=new ArrayList<>();
        int l=0,r=n-1;
        int min=Integer.MAX_VALUE;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(Math.abs(target-sum)<min){
                min=Math.abs(target-sum);
                res=Arrays.asList(arr[l],arr[r]);
            }
            if(sum<target) l++;
            else if(sum>target) r--;
            else return res;
        }
        return res;
    }
}
