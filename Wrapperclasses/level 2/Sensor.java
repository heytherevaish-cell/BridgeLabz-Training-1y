public class Sensor {

    public static void log(Double temp) {
        System.out.println("Stored Temp: " + temp);
    }

    public static void main(String[] args) {
        double primitive = 36.5;
        Double wrapper = 37.8;

        log(primitive); // autoboxing
        log(wrapper);

        double value = wrapper; // unboxing
        System.out.println("Read Temp: " + value);
    }
}