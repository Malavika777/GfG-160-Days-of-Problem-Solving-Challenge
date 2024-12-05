class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i:arr)
            m.put(i,m.getOrDefault(i,0)+1);
        int[] a={0,1,2};
        int k=0;
        for(int i:a){
            int c=m.getOrDefault(i,0);
            for(int j=0;j<c;j++){
                arr[k++]=i;
            }
        }
    }
}
