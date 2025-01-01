class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        ArrayList<ArrayList<String>>res=new ArrayList<>();
        boolean[] vis=new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(!vis[i]){
                ArrayList<String>set=new ArrayList<>();
                char s[]=arr[i].toCharArray();
                Arrays.sort(s);
                set.add(arr[i]);
                vis[i]=true;
                for(int j=i+1;j<arr.length;j++){
                    if(!vis[j]){
                        char a[]=arr[j].toCharArray();
                        Arrays.sort(a);
                        if(Arrays.equals(s,a)) {
                            set.add(arr[j]);
                            vis[j]=true;
                        }
                    }   
                }
                res.add(set);
            }
        }
        return res;
    }
}
