public class Marks {
    public static void main(String[] args) {
        Object[] data = {"85", 95, Integer.valueOf(88), "null"};

        int sum = 0, count = 0;

        for (Object obj : data) {
            try {
                if (obj != null && !obj.equals("null")) {
                    int val = Integer.parseInt(obj.toString());
                    sum += val;
                    count++;
                }
            } catch (Exception e) {
                // ignore invalid
            }
        }

        System.out.println("Average Marks = " + (sum / (double) count));
    }
}