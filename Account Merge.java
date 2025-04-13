class Solution {
    static ArrayList<ArrayList<String>> accountsMerge(
        ArrayList<ArrayList<String>> arr) {
        // code here
        Map<String,ArrayList<String>>adj=new HashMap<>();
        Set<String>vis=new HashSet<>();
        for(ArrayList<String>i:arr){
            String first=i.get(1);
            for(int j=2;j<i.size();j++){
                String email=i.get(j);
                adj.computeIfAbsent(first,k->new ArrayList<>()).add(email);
                adj.computeIfAbsent(email,k->new ArrayList<>()).add(first);
            }
        }
        ArrayList<ArrayList<String>>acc=new ArrayList<>();
        for(ArrayList<String>i:arr){
            String name=i.get(0);
            String first=i.get(1);
            if(!vis.contains(first)){
                ArrayList<String>a=new ArrayList<>();
                a.add(name);
                dfs(a,first,vis,adj);
                acc.add(a);
            }
        }
        return acc;
    }
    public static void dfs(ArrayList<String>a,String email,Set<String> vis,Map<String,ArrayList<String>>adj){
        vis.add(email);
        a.add(email);
        for(String x:adj.getOrDefault(email,new ArrayList<>())){
            if(!vis.contains(x))
                dfs(a,x,vis,adj);
        }
    }
}
