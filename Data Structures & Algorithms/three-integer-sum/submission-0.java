class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int left = 0;
        int right = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            // check for duplicate
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            left = i + 1;
            right = nums.length - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    res.add(Arrays.asList(nums[i],nums[left], nums[right]));
                    left++;
                    right--;
                    // check for duplicatelse
                    while(left< right && nums[left] == nums[left-1]){
                        left++;

                    }
                     while(left< right && nums[right] == nums[right+1]){
                        right--;

                    }
                }
                else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;

                }
                else if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                }
            }
        }
        return res;
    }
}
