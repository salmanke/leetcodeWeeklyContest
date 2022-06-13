public class Main {

    public static minMax(int []nums){
        int n=nums.length,ind=0;
        if(n==1)
            return nums[0];
        int a[]=new int[n/2];
        for(int i=0;i<n;i+=2){
            if(i%2==0)
                a[ind++]=Math.min(nums[2 * i], nums[2 * i + 1]);
            else
                a[ind++]=Math.max(nums[2 * i], nums[2 * i + 1]);
        }
        return minMax(a);
    }
    
}
