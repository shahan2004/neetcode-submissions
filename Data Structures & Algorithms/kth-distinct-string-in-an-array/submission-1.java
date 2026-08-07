

class Solution {
    public String kthDistinct(String[] arr, int k) {

        int n = arr.length;
        int count = 0;
        String result = "";

        HashMap<String, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if (freq.containsKey(arr[i])) {
                freq.put(arr[i], freq.get(arr[i]) + 1);
            }
            else {
                freq.put(arr[i], 1);
            }
        }

        for (int i = 0; i < n; i++) {

            if (freq.get(arr[i]) == 1) {
                count++;

                if (count == k) {
                    result = arr[i];
                }
            }
        }

        return result;
    }
}