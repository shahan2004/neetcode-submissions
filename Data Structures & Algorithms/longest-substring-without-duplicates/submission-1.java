class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            // Remove characters until current character is unique
            while (hs.contains(s.charAt(right))) {
                hs.remove(s.charAt(left));
                left++;
            }

            // Add current character
            hs.add(s.charAt(right));

            // Current window has no duplicates
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}