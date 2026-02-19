public class ArrayIndexDemo {

    public static void generateException() {
        String[] names = {"A", "B", "C"};
        System.out.println(names[5]);
    }

    public static void handleException() {
        try {
            String[] names = {"A", "B", "C"};
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        // generateException();
        handleException();
    }
}
