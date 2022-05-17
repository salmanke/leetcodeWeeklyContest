class Solution {
    public String largestGoodInteger(String num) {
        char[] ch=num.toCharArray();
        boolean flag=false;
        int n=ch.length,len=1,maxL=0,temp=0;
        int prev=ch[0]-'0';
        for(int i=1;i<n;i++){
            int cur=ch[i]-'0';
            if(cur==prev){
                len++;
            }
            else{
                len=1;
            }                                                
            if(maxL<=len&&len==3&&cur>=temp){
                flag=true;
                maxL=len;
                temp=cur;
            }
            prev=cur;
        }
        String s="";
        if(flag){
        for(int i=0;i<3;i++)
            s+=Integer.toString(temp);
        }
        return s;
    }
}