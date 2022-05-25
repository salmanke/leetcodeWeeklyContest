public int minimumLines(int[][] stockPrices) {
    int count=1,n=stockPrices.length;
    Arrays.sort(stockPrices,(a,b)->a[0]-b[0]);

    for(int i=1;i<n-1;i++){
        int x1=stockPrices[i-1][0],y1=stockPrices[i-1][1];
        int x2=stockPrices[i][0],y2=stockPrices[i][1];
        int x3=stockPrices[i+1][0],y3=stockPrices[i+1][1];

        int m1=(x3-x2)*(y2-y1),m2=(y3-y2)*(x2-x1);
        if(m1==m2)
            continue;
        else
            count++;
    }
    return count;
}
