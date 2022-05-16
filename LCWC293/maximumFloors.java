public int maxConsecutive(int bottom, int top, int[] special) {
    int max=Integer.MIN_VALUE;
    Arrays.sort(special);
    max=Math.max(max,special[0]-bottom);
    int n=special.length;
    for(int i=1;i<n;i++){
        max=Math.max(max,special[i]-special[i-1]-1);
    }
    max=Math.max(max,top-special[n-1]);
    
    return max;
}