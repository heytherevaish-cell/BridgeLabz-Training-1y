public class Q4_Cart {
    public static void main(String[] args) {
        String[] prices = {"100", "200", "xyz", "50"};
        int total = 0;

        for (String p : prices) {
            try {
                total += Integer.parseInt(p);
            } catch (NumberFormatException e) {
                System.out.println("Invalid price: " + p);
            }
        }

        System.out.println("Total Price = " + total);
    }
}