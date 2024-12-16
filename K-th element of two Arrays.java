class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n=a.length;
        int m=b.length;
        int i=0,j=0,c=0;
        int res=0;
        while(i<n&&j<m){
            if(a[i]<b[j]){
                res=a[i];
                i++;
            }else{
                res=b[j];
                j++;
            }
            c++;
            if(c==k) return res;
        }
        while(i<n){
            res=a[i];
            i++;
            c++;
            if(c==k) return res;
        }
        while(j<m){
            res=b[j];
            j++;
            c++;
            if(c==k) return res;
        }
        return res;
    }
}
