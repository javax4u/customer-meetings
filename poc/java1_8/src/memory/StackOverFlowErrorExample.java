package memory;

public class StackOverFlowErrorExample {

    public static void main(String args[]) {
        printNumber();
    }

    private static void printNumber() {
        // put some condition here to break it
        printNumber();
    }
}
