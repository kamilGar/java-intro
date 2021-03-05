public class PESEL {

    String numerPESEL;

    PESEL(String numerPESEL) {
        this.numerPESEL = numerPESEL;
    }

    String checkPESEL() {

        try {
            Long.parseLong(numerPESEL);
        } catch (NumberFormatException e) {
            throw new WrongTypeOfDataException("Invalid type of data - PESEL should be a number");
        }
        if (numerPESEL.length() != 11) {
            throw new IllegalLengthException("Invalid PESEL lenght - should be 11 (was " + numerPESEL.length() + ")");
        } return "Numer PESEL jest poprawny";
    }
}