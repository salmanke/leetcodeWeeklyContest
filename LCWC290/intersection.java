class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] count = new int[1001];
        List<Integer> intersection = new ArrayList<>();
        for(int[] array : nums) {
            for(int number : array) {
                count[number]++;
            }
        }
        for(int i = 1; i < count.length; i++) {
            if(count[i] == nums.length) {
                intersection.add(i);
            }
        }
        return intersection;
    }
}