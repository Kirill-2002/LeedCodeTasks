class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0, left = 0, right = 0;

        while (right < n) {
            char currentChar = s.charAt(right);
            if (!set.contains(currentChar)) {
                set.add(currentChar);
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;

        
    }
}