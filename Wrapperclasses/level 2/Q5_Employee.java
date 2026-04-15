import java.util.*;

public class Q5_Employee {
    public static void main(String[] args) {
        int[] ages = {18, 45, 32, 27};

        ArrayList<Integer> list = new ArrayList<>();

        for (int age : ages) {
            list.add(age);
        }

        System.out.println("Min Age = " + Collections.min(list));
        System.out.println("Max Age = " + Collections.max(list));
    }
}