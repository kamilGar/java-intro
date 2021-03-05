public class ReversedString {

    static String reverse(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
                result += str.charAt(str.length() - i - 1);
            }
        return result;
    }

}

