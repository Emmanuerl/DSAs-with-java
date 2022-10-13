package ds;

import java.util.Iterator;
import java.util.LinkedList;

public class CustomLinkedList {
    public static void main(String[] args) {
        final LinkedList<Person> relayArrangement = new LinkedList<Person>();
        relayArrangement.add(new Person("kruse"));
        relayArrangement.add(new Person("emmanuel"));
        relayArrangement.add(new Person("emeka"));

        // before: kruse -> emmanuel -> emeka
        relayArrangement.add(1,new Person("Victoria")); // after: kruse -> victoria -> emmanuel -> emeka

        // get head and tail
        // System.out.println(relayArrangement.getFirst());
        // System.out.println(relayArrangement.getLast());

        // you can also iterate over them
        Iterator<Person> iterator = relayArrangement.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
        System.out.println();
        // or better still, use an enhanced for
        for(Person athlete: relayArrangement) System.out.println(athlete);
    }

    static record Person(String name) {}
}
