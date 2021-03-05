public class tests {

    public static void main(String[] args) {
        int[] testValues = new int[30];

        for (int i = 0; i < 30; i++)
            testValues[i] = i + 1;

        DivideBy3.validate(testValues);

    }

}
