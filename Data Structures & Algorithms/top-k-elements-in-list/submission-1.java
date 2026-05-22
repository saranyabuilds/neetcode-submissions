class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numFreq = new HashMap<>();
        List<int[]> mostFreq = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            numFreq.put(nums[i], numFreq.getOrDefault(nums[i], 0) + 1);
        }

        // why nums.length+1 because max possible freq is nums.length . 
        // if there are 5 numbers in nums and all are same, frequency of that number is 5 and 
        // in array index start with 0 so we need 1 extra length to match the max possible freq index number
        List<Integer>[] bucket = new ArrayList[nums.length+1];

        for(int i : numFreq.keySet()){
            // Frequency is the index of the bucket. if frequency is null create new array list
            if(bucket[numFreq.get(i)] == null){
                bucket[numFreq.get(i)] = new ArrayList<>();
            }
            bucket[numFreq.get(i)].add(i);
        }

        int[] res = new int[k];
        int index = 0;

        for(int i = bucket.length-1; i>=0; i--){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    res[index] = num;
                    index++;
                }
                if(index == k){
                    return res;
                }

            }
        }


        return res;
    }
}
