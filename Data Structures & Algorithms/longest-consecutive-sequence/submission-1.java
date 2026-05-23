class Solution {
    public int longestConsecutive(int[] nums) {
        // length of the longest consecutive
        int longest = 0;
        // To remove duplicates, change nums array to set
        Set<Integer> set = new HashSet<>();
        // loop through the nums array and add it to set
        for (int num : nums) {
            set.add(num);
        }
        // Loop through the set and find for each number if there is a previous number and next
        // number if it is there add to longest length
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                // resetting the longest for every number
                longest = Math.max(longest, currentLength);
            }
        }

        return longest;
    }
}
