public class ConsoleMessage extends Message {

    String className = "ConsoleMessage";

    @Override
    String getMessage() {
        return "This is class "+ className;

    }
}
