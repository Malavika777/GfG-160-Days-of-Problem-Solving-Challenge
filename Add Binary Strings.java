class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        s1=s1.replaceFirst("^0+(?!$)", "");
        s2=s2.replaceFirst("^0+(?!$)", "");
        int l1=s1.length()-1,l2=s2.length()-1;
        int c=0;
        StringBuilder res=new StringBuilder();
        while(l1>=0||l2>=0||c!=0){
            int b1=(l1>=0)?s1.charAt(l1)-'0':0;
            int b2=(l2>=0)?s2.charAt(l2)-'0':0;
            int sum=b1+b2+c;
            res.append(sum%2);
            c=sum/2;
            l1--;
            l2--;
        }
        return res.reverse().toString();
    }
}
