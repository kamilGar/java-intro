class TextCheck {

    String text;

    TextCheck(String text) {
        this.text = text;
    }

    int textLength() {
        int result = 0;
        if (!(text.equals(""))) {
            result = text.length(); // problem
        } return result;
    }

    boolean checkIfPalindrome() {
        boolean result = false;
        if (!(text.equals(""))) {
            result = true;
            text = text.toLowerCase();
            int k = (text.length() - 1);
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) != text.charAt(k)) {
                    result = false;
                    break;
                }
                k--;
            }

        } return result;

    }
}
