public List<String> removeAnagrams(String[] words) {
    List<String> res=new ArrayList<>();
    int n=words.length;
    Stack<String> stk=new Stack<>();
    for(int i=n-1;i>=0;i--){
        String s=words[i];
        while(!stk.isEmpty()&&helper(s,stk.peek()))
            stk.pop();
        stk.push(s);
    }
    while(!stk.isEmpty())
        res.add(stk.pop());
    return res;
}
public static boolean helper(String s1,String s2){
    int a[]=new int[26];
    for(char c:s1.toCharArray())
        a[c-'a']++;
    for(char c:s2.toCharArray())
        a[c-'a']--;
    for(int i:a){
        if(i!=0)
            return false;
    }
    return true;
}
