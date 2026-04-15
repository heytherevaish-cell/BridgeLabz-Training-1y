import java.util.*;

public class Ratings {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, null, 4));

        ArrayList<Integer> combined = new ArrayList<>();

        for (int i : arr) {
            combined.add(i);
        }

        combined.addAll(list);

        int sum = 0, count = 0;

        for (Integer r : combined) {
            if (r != null) {
                sum += r;
                count++;
            }
        }

        System.out.println("Average Rating = " + (sum / (double) count));
    }
}