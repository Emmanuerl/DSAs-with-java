package ds;

import java.util.LinkedList;
import java.util.Queue;

public class CustomQueue {
    // the queue interface extends the collection interface as well
    // a linked list is a class that implements the queue
    // a priority queue also implements the queue

    public static void main(String[] args) {
        Queue<Person> oriolaQueue = new LinkedList<>();

        oriolaQueue.add(new Person("Omolefe", 19));
        oriolaQueue.add(new Person("Oyin", 22));
        oriolaQueue.add(new Person("Saheed", 13));
        oriolaQueue.add(new Person("Samuel", 15));
        // System.out.println(oriolaQueue.size());
        // System.out.println(oriolaQueue.peek()); // checks but doesn't remove
        // System.out.println(oriolaQueue.size());
        // System.out.println(oriolaQueue.poll()); // removes and returns the removed item
        // System.out.println(oriolaQueue.size());

        final var iterator = oriolaQueue.iterator();
        // while (iterator.hasNext()) System.out.println(iterator.next());

        // however, the enhanced for is generally a better approached
        for (Person person : oriolaQueue) System.out.println(person);

        // using the offer and remove methods: a safer version of peek and
        oriolaQueue.offer(null); // inserts if possible and return a boolean
        oriolaQueue.remove(); // removes from a queue, throws exception if queue is empty;
    }

    /*
     * Record type: a sweeter and nicer way of declaring entities like classes
     * that just hold values, rather than having to set up a class
     * NOTES:
     *  1. Every property declared in the "constructor" are constants (final) and are private
     *  2. records do not have a setter method
     *  3. You are allowed to override existing methods though
     *  4. You can create instance and static methods
     *  5. You can create static fields/properties. YOU CAN NOT CREATE INSTANCE FIELDS/PROPERTIES
     *  6. Records cannot extend other classes... why? a class can only extend one class and record already extends the Record class
     *  7. records are also implicitly final classes: they cannot be extended by other classes
     *  8. Records can implement interfaces
     *  9. You can override the constructor like other classes. note that the constructor is more or less helpless in this case.
     *     you can only perform read only operations and the likes
     *  10. Compact constructors: constructors that do not have the usual parameter's declaration.
     * @param name
     * @param age
     */
    static record Person(String name, int age) {
        public String nameInUppercase() {
            return name.toUpperCase();
        }

        public static void printWhatever() {
            System.out.println("Whatever");
        }

        public Person {
            if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
        }
    }

}
