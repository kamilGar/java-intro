public class PeselValidator {

    private final String PESEL_NUMBER;

    PeselValidator(String PESEL_NUMBER) {
        this.PESEL_NUMBER = PESEL_NUMBER;
    }

    boolean IsValid() {

        try {
            Long.parseLong(PESEL_NUMBER);
        } catch (NumberFormatException e) {
            throw new WrongTypeOfDataException("Invalid type of data - PESEL should be a number");
        }
        if (PESEL_NUMBER.length() != 11) {
            throw new IllegalLengthException("Invalid PESEL lenght - should be 11 (was " + PESEL_NUMBER.length() + ")");
        } else {
            return true;
        }
    }
}