package ds;

import java.util.ArrayList;

public class CustomList {
    public static void main(String[] args) {
        java.util.List<String> colors = new ArrayList<String>();
        colors.add("black");
        colors.add("Yellow");

        System.out.println(colors.contains("pink"));
        System.out.println(colors.size());

        // this works (enhanced for
        for (String color : colors) System.out.println(color);

        // foreach also works
        colors.forEach(System.out::println);

        // traditional for loop also works
        // for(int i = 0; i < colors.size(); i++) System.out.println(colors.get(i));

        // the of method creates an immutable list
        java.util.List<Integer> numbers = java.util.List.of(1, 2, 3, 4, 5, 6);
    }
}
