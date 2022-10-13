package ds;

public class CustomArray {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "green";
        colors[1] = "red";
        colors[2] = "blue";

        // to loop through
        for (String color : colors) {
            System.out.println(color);
        }

        // optionally to loop through using a stream
        java.util.Arrays.stream(colors).forEach(System.out::println);
    }
}
