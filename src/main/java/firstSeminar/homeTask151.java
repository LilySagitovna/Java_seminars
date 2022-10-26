package firstSeminar;

public class homeTask151 {
    class Solution {
        public String reverseWords(String s) {
            StringBuilder sb = new StringBuilder("");
            int n = s.length();
            int j = 0, k = 0, i = 0;
            for (i = n - 1; i >= 0; i--) {
                while (i >= 0 && s.charAt(i) == ' ') {
                    i--;
                }
                j = i;
                while (i >= 0 && s.charAt(i) != ' ') {
                    i--;
                }
                k = i + 1;
                while (k <= j) {
                    sb.append(s.charAt(k));
                    k++;
                }
                while (i >= 0 && s.charAt(i) == ' ') {
                    i--;
                }
                if (i != -1) sb.append(' ');
                i += 1;
            }
            return sb.toString();
        }
    }
}
