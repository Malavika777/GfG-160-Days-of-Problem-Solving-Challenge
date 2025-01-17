class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int zero=0,idx=-1,prod=1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
                idx=i;
            }
            else prod*=arr[i];
        }
        int[] res=new int[n];
        if(zero==0){
            for(int i=0;i<n;i++)
                res[i]=prod/arr[i];
        }
        else if(zero==1){
            res[idx]=prod;
        }
        return res;
    }
}
