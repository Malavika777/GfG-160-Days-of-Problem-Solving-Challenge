class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        int c=0;
        Map<Integer,Integer>m=new HashMap<>();
        for(int i:arr){
            if(m.containsKey(target-i))
                c+=m.get(target-i);
            m.put(i,m.getOrDefault(i,0)+1);
        }
        return c;
    }
}
