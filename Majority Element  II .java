class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n=nums.length/3;
        List<Integer>res=new ArrayList<>();
        Map<Integer,Integer>m=new HashMap<>();
        for(int i:nums)
            m.put(i,m.getOrDefault(i,0)+1);
        for(int i:m.keySet()){
            if(m.get(i)>n)
                res.add(i);
        }
        return res;
    }
}
