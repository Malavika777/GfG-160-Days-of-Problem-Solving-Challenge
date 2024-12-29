class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        Set<Integer>set=new HashSet<>();
        ArrayList<Integer>res=new ArrayList<>();
        for(int i:a)
            set.add(i);
        for(int i:b){
            if(set.contains(i)&&!res.contains(i)) 
                res.add(i);
        }
        return res;
    }
}
