public class MessageTests {

    public static void main(String[] args) {

        WindowMessage windowMessageObject = new WindowMessage();
        ConsoleMessage consoleMessageObject = new ConsoleMessage();

        System.out.println(windowMessageObject.getMessage());
        System.out.println(consoleMessageObject.getMessage());
    }

}
