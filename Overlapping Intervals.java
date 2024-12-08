class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        Arrays.sort(arr,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return a[0]-b[0];
            }
        });
        List<int[]>res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int m=res.size()-1;
            if(res.isEmpty()||arr[i][0]>res.get(m)[1]){
                res.add(new int[]{arr[i][0],arr[i][1]});
            }
            else{
                res.get(m)[1]=Math.max(arr[i][1],res.get(m)[1]);
            }
        }
        return res;
    }
}
