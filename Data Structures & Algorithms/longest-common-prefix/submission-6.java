class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        if (strs.length == 1) {
            return strs[0];
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char curr = strs[0].charAt(i);
            System.out.println("curr-" + curr);

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() > 0 && i < strs[j].length()) {
                    if (curr == strs[j].charAt(i)) {
                        if (j == strs.length - 1) {
                            System.out.println("Add to prefix");
                            res.append(curr);
                        }
                        continue;
                    } else {
                        return res.toString();
                    }
                } else {
                    return res.toString();
                }
            }
        }
        return res.toString();
    }
}