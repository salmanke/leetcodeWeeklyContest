public static int percentage(String s,Char letter){
    double p=0.0;
    int n=s.length();
    for(int i=0;i<n;i++){
        if(s.charAt(i)==letter)
            p++;
    }
    double percent=cnt/n;
    return (int)(percent*100);
}
