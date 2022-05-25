public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        
    int count=0,n=rocks.length;
    
    for(int i=0;i<n;i++)
        rocks[i]=capacity[i]-rocks[i]; //the remaining capacity will be calculated
    
    Arrays.sort(rocks);
    
    for(int i=0;i<n;i++){
        if(rocks[i]<=additionalRocks){
            count++;
            additionalRocks-=rocks[i];
        }
    }
    return count;
}