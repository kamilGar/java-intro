class ToUpperCase {

    static String convertToUpper(String str) {
        if (str == null || str.length() == 0) {
            return "";
        } else {
            return str.toUpperCase();
        }
    }

}
