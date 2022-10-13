package ds;

import java.util.*;

public class CustomMap {
    public static void main(String[] args) {
        Map<String,String> wordsAndOpposite = new HashMap<>();
        wordsAndOpposite.put("good","bad");
        wordsAndOpposite.put("tall","short");
        wordsAndOpposite.put("up","down");

        System.out.println(wordsAndOpposite);
        System.out.println(wordsAndOpposite.size());

        System.out.println(wordsAndOpposite.containsKey("omo"));

        // kinda like Object.entries() of JS
        System.out.println(wordsAndOpposite.entrySet());

        // kinda like Object.values() of JS
        System.out.println(wordsAndOpposite.values());

        // kinda like Object.keys() of JS
        System.out.println(wordsAndOpposite.keySet());

        // to loop through
        wordsAndOpposite.forEach((key,value)->{
            System.out.println(key + " - " + value);
        });

        // optionally
        wordsAndOpposite.entrySet().forEach(x -> {
            System.out.println(x.getKey() + " - " + x.getValue());
        });

        System.out.println();
        System.out.println();

        /*
         * HASH CODES AND HASH FUNCTIONS
         * Hash function is used to generate a hash
         * when working with hash maps, whenever you provide a key,value pair
         * a hash of the key is generated and this hash is what is used to map the value in memory
         * so for every action with the key
         *
         * key -----> (hash function ===> hashKey) --------> retrieves value mapped to the hash key provided
         *
         * the problem here is, for non-primitive keys without the equals and hashCode methods, they won't be equal even if their properties are equal
         */
        Map<Person,Person> couples = new HashMap<>();
        couples.put(new Person("emmanuel"),new Person("victoria"));

        System.out.println(couples.get(new Person("emmanuel"))); // return null because the Person class has no hashCode

        System.out.println(new Person("emmanuel").hashCode());
        System.out.println(new Person("emmanuel").hashCode());
    }

    // note : every class inherits from the Object class implicitly
    static class Person{
        String name;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person person)) return false;
            return Objects.equals(name, person.name);
        }

//        @Override
//        public int hashCode() {
//            return Objects.hash(name);
//        }
    }
}
