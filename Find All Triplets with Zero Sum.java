class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        Set<ArrayList<Integer>>res=new HashSet<>();
        int n=arr.length;
        Map<Integer,List<int[]>> m=new HashMap<>();
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++)
                m.computeIfAbsent(arr[i]+arr[j], k->new ArrayList<>()).add(new int[]{i,j});
        }
        for (int i=0;i<n;i++){
            int rem=-arr[i];
            if(m.containsKey(rem)){
                List<int[]> pair=m.get(rem);
                for (int[] p:pair){
                   if (p[0]!=i&&p[1]!=i){
                        ArrayList<Integer>curr=new ArrayList<>(Arrays.asList(i,p[0],p[1]));
                        Collections.sort(curr);
                        res.add(curr);
                    }
                }
            }
        }
        return new ArrayList<>(res);  
    }
}
