package leetcode;

class LongestSubstring {

    int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        // Any pos is inside [1, s.length()] so that pos == 0 means symbol not seen yet
        // Original code assumed any character can be in the string, so size was Character.MAX_VALUE
        int[] lastSeenPos = new int[256];

        lastSeenPos[s.charAt(0)] = 1;
        int currStartPos = 1;
        int maxStartPos = 1;
        int maxEndPos = 1;

        for (int pos = 2; pos <= s.length(); ++pos) {
            final char symbol = s.charAt(pos-1);
            if (lastSeenPos[symbol] < currStartPos) {
                if (pos - currStartPos > maxEndPos - maxStartPos) {
                    maxStartPos = currStartPos;
                    maxEndPos = pos;
                }
            } else {
                currStartPos = lastSeenPos[symbol] + 1;
            }
            lastSeenPos[symbol] = pos;
        }

        return maxEndPos - maxStartPos + 1;
    }
}
