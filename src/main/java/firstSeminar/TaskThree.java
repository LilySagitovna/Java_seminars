//package firstSeminar;
//
//public class TaskThree {
//        public String addBinary(String a, String b) {
//            if (a.length() < b.length()) {
//                return addBinary(b, a);
//            }
//            int carry = 0;
//            int j = b.length() - 1;
//            String ans = "";
//            for (int i = a.length() - 1;i >= 0; i--) {
//                if (a.charAt(i) == '1') {
//                    carry += 1;
//                }
//                if (j >= 0 && b.charAt(j) == '1') {
//                    carry += 1;
//                }
//                ans = carry % 2 + ans;
//                j--;
//                carry /= 2;
//            }
//            if (carry > 0) {
//                ans = carry % 2 + ans;
//            }
//            return ans;
//        }
//}

package firstSeminar;

public class TaskThree {
    public String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            return addBinary(b, a);
        }
        int carry = 0;
        int j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                carry += 1;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                carry += 1;
            }
            sb.append(carry % 2);
            j--;
            carry /= 2;
        }
        if (carry > 0) {
            sb.append(carry % 2);
        }
        return sb.reverse().toString();
    }
}
