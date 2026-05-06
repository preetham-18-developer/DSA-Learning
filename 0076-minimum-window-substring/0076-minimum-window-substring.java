class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int have = 0;
        int needCount = need.size();

        int left = 0;

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (need.containsKey(ch) &&
                window.get(ch).intValue() == need.get(ch).intValue()) {

                have++;
            }

            while (have == needCount) {

                int windowLen = right - left + 1;

                if (windowLen < minLen) {
                    minLen = windowLen;
                    start = left;
                }
                char leftChar = s.charAt(left);

                window.put(leftChar, window.get(leftChar) - 1);
                if (need.containsKey(leftChar) &&
                    window.get(leftChar) < need.get(leftChar)) {

                    have--;
                }

                left++;
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}