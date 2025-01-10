class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        Map<Integer,Integer>m=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<k;i++){
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        res.add(m.size());
        for(int i=k;i<n;i++){
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
            m.put(arr[i-k],m.get(arr[i-k])-1);
            if(m.get(arr[i-k])==0)
                m.remove(arr[i-k]);
            res.add(m.size());
        }
        return res;
    }
}
