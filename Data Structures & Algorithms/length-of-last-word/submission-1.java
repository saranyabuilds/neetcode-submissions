class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder lastWord = new StringBuilder();
        StringBuilder actualWord = new StringBuilder();
        for(int i = 0; i< s.length(); i++){
            actualWord.append(s.charAt(i));
        }
        s = actualWord.reverse().toString();
         System.out.println(s);
        boolean check = false;

        if (s.length() > 0) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ' && check == false) {
                     System.out.println("firstloop");
                    continue;
                }
               else if (s.charAt(i) == ' ' && check) {
                    break;
                }
                else{
                    lastWord.append(s.charAt(i));
                    System.out.println(s.charAt(i));
                    check = true;
                }
            }
        }
        System.out.println(lastWord);
        return lastWord.length();
    }
}