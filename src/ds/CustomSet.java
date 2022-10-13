package ds;

import java.util.HashSet;
import java.util.Set;

public class CustomSet {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("red"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("green"));
        balls.add(new Ball("green"));

        System.out.println(balls.toString());

        // sets handles duplicates using the toString and hashCode methods of the type of date it holds.
        // hence if you create a set of an object/class/type without these two methods, uniqueness is lost

        System.out.println(balls.size());

        // you can also use the foreach loop
        // chipping in a lambda function 😅
        balls.forEach((n) -> {
            printColor(n);
        });

        // or using method references
        balls.forEach(CustomSet::printColor);
    }

    static void printColor(Ball b) {
        System.out.println(b.color());
    }

    static record Ball(String color) {
    }
}
