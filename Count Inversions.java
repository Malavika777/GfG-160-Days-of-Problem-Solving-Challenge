class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int[] arr){
        int[] temp=new int[arr.length];
        return merge(arr,temp,0,arr.length-1);
    }
    public static int merge(int[] arr,int[] temp,int low,int high){
        int c=0;
        if (low<high){
            int mid=low+(high-low)/2;
            c+=merge(arr,temp,low,mid);
            c+=merge(arr,temp,mid+1,high);
            c+=mergeCount(arr,temp,low,mid,high);
        }
        return c;
    }
    public static int mergeCount(int[] arr,int[] temp,int low,int mid,int high){
        int i=low,j=mid+1,k=low;
        int c=0;
        while (i<=mid && j<=high){
            if (arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            } 
            else{
                temp[k++]=arr[j++];
                c+=(mid-i+1); 
            }
        }
        while (i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=high){
            temp[k++]=arr[j++];
        }
        for (i=low;i<=high;i++){
            arr[i]=temp[i];
        }
        return c;
    }
}
