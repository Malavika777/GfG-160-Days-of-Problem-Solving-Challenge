class Solution {
    public ArrayList<Integer> longestSubarray(int[] arr, int x) {
        // code here
        Deque<Integer>min=new LinkedList<>();
        Deque<Integer>max=new LinkedList<>();
        int n=arr.length,start=0,end=0;
        int resStart=0,resEnd=0;
        while(end<n){
            while(!min.isEmpty()&&arr[min.peekLast()]>arr[end])
                min.pollLast();
            while(!max.isEmpty()&&arr[max.peekLast()]<arr[end])
                max.pollLast();
            min.addLast(end);
            max.addLast(end);
            while(arr[max.peekFirst()]-arr[min.peekFirst()]>x){
                if(start==min.peekFirst())
                    min.pollFirst();
                if(start==max.peekFirst())
                    max.pollFirst();
                start++;
            }
            if(end-start>resEnd-resStart){
                resStart=start;
                resEnd=end;
            }
            end++;
        }
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=resStart;i<=resEnd;i++)
            res.add(arr[i]);
        return res;
    }
}
