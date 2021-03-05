public class DivideBy3 {

    public static void validate(int[] values) {
        try {
            for (int value : values) {
                if (value % 3 != 0) {
                    throw new IllegalArgumentException(value + " isn't divisible by 3");
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("There was an exception: " + e.getMessage());
        }
    }
}
