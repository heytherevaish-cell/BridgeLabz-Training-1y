import java.util.*;

public class Benchmark {
    public static void main(String[] args) {

        int n = 1_000_000;

        // int[]
        long start1 = System.currentTimeMillis();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i;

        long sum1 = 0;
        for (int i : arr) sum1 += i;

        long end1 = System.currentTimeMillis();

        // ArrayList<Integer>
        long start2 = System.currentTimeMillis();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(i);

        long sum2 = 0;
        for (int i : list) sum2 += i;

        long end2 = System.currentTimeMillis();

        System.out.println("int[] Time = " + (end1 - start1) + " ms");
        System.out.println("ArrayList Time = " + (end2 - start2) + " ms");
    }
}