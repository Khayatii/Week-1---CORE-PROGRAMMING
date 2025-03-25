public class NullPointerDemo {
    public static void main(String[] args) {
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e);
        }
    }

    public static void generateException() {
        String name = null;
        System.out.println(name.length());
    }

    public static void handleExecption() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println(" NullPointerException Handled: " + e);
        }
    }
}