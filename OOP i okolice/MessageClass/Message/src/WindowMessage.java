public class WindowMessage extends Message {

    String className = "WindowMessage";

    @Override
    String getMessage() {
        return "This is class "+ className;

    }
}
