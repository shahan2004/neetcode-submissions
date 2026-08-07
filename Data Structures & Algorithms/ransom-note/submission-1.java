class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        char[] mg = magazine.toCharArray();
        int n = mg.length;
        int[] freq1 = new int[26];

        char[] rn = ransomNote.toCharArray();
        int x = rn.length;
        int[] freq2 = new int[26];

        for (int i = 0; i < n; i++) {
            freq1[mg[i] - 'a']++;
        }

        for (int i = 0; i < x; i++) {
            freq2[rn[i] - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq1[i] < freq2[i]) {
                return false;
            }
        }

        return true;
    }
}