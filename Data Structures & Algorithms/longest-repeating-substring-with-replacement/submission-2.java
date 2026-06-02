class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int l = 0, maxf = 0, res = 0;

        for (int r = 0; r < s.length(); r++) {
            // Create frequency map - char and number of times occured
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);
            // Max frq so far
            maxf = Math.max(maxf, count.get(s.charAt(r)));
            // if it exceeds the max window, remove the left most char from freqMap
            while ((r - l + 1) - maxf > k) {
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
