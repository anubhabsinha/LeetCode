class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();

        Arrays.sort(nums);
        int currele = nums[0];


        for(int i =0;i<nums.length; currele++, i++){
            if(currele<nums[i]){
                res.add(currele);
                i--;
            }
        }
        return res;
    }
}