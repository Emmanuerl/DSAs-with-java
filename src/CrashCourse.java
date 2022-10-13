import java.awt.*;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class CrashCourse {
    public static void main(String[] args) {
        System.out.println("===== CORE BASICS =====");
        // 1. A class is a blueprint for modelling an object
        // 2. A model is literally any entity, irrespective of which
        // 3. Similar classes can be namespaced/grouped into a package and this package can be used in other places using the import keyword... look up!
        // 4. Every application must have at least one main method that serves as the entry point for the application. You're currently in my main method 😒

        System.out.println("===== PRIMITIVE TYPES =====");
        /* Primitives : pass by value
        for signed values    -2^(n-1) - 2^(n-1) - 1
        unsigned values   0 - (2^n) - 1
        where n = number of bits
        TYPE    Bytes
        byte     1       signed
        short    2       signed
        int      4       signed
        long     8       signed

        float     4       signed
        double   8       signed
        char     2       supports international letters
        boolean  1       true/false
         */

        // to get the maximum / minimum  value of a data type, use the Type.{MAX,MIN}_VALUE
        System.out.printf("byte minimum: %d, maximum: %d%n", Byte.MIN_VALUE, Byte.MAX_VALUE);

        // string formatting -> https://dzone.com/articles/how-to-format-a-string-clarified
        // Note that java doesn't throw errors for unused variables
        byte age = 127;
        short laptopPrice = 32_000;
        int mostlyUsed = 400_000; // default integer type
        long ageOfTheEarth = 7_000_000_000L; // 7_000_000_000l also works
        float pi = 3.14F; // 3,14l also works
        double doublePi = 6.24; // default
        char alphabet = 'a';
        char dollars = '$';
        boolean javaIsLookingHard = false;

        System.out.println("===== INTRO. TO REFERENCE TYPES =====");
         /* Reference types: pass by reference
         Some of the most utilised reference types (asides from the data structures)
            Type    Package
            Date    java.utils  handling dates
            Point   java.awt    for storing coordinates
            String  java.lang   handling strings
            Array   java.lang   immutable list (they have a fixed size)
         */
        Date now = new Date(); // defaults to current time if none is provided
        // optionally, the LocalDateTime class can be used
        LocalDateTime myCurrentTime = LocalDateTime.now();

        Point location = new Point(1, 2);
        System.out.println(location.y); // prints 12

        System.out.println("===== STRING METHODS =====");
        /*
         * String operations
         */
        String message = "Hello"; //new String("a less preferred way of initialising a string");
        // 1, concatenation
        message += " World";

        // to get the length of a string
        System.out.println(message.length());

        // Strings are immutable: calling string methods on a string returns a new instance of that string
        // 2. manipulation
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message);

        // 3. Searching
        System.out.println(message.indexOf(" ")); // return index of the first occurrence of the string or -1

        // 4. replacing
        System.out.println(message.replace("Hello", "How far"));

        System.out.println("===== ARRAY BASICS =====");
        /*
         *  Arrays
         * 1. Immutable
         * 2. all elements must be of the same type
         */
        // declaring an array
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        // java will throw an exception if the index it out of bounds
        // numbers[5] = 10; // throws an exception

        // printing out an array this way will return the address of the first element of the array
        System.out.println(numbers);
        // in order to print out the object properly, the Arrays.toString() method can be used
        // the Arrays.* methods can be called on by int[],char[] and basically any primitive[],
        // the concept of one method having the ability to accept multiple types of parameters is called method overloading
        System.out.println(Arrays.toString(numbers)); // [1,2,0,0,0] : java assigns default values to unassigned elements

        // declaring and initialising the array
        int[] numbers2 = {1, 3, 2, 11, 4, 6, 0};
        //to sort the array, the Arrays.sort method can also be used
        // NOTE: this modifies the original array
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2)); // [0, 1, 2, 3, 4, 6, 11]

        System.out.println("===== CASTING =====");
        /*
         * Casting
         * can be explicit or implicit
         */
        // explicit
        int radius = 4;
        final double PI = 3.142; // final keyword is used for declaring constants
        double perimeter = (double) radius * 2 * PI; // radius is explicitly converted to a double, "2" is implicitly converted to a double
        System.out.println(perimeter);

        /*
         * Order of casting
         * byte -> short -> int -> long -> float -> double
         *
         * if peradventure you want to cast in the opposite direction (which will lead to data loss), explicit casting can be used
         */
        long lng = 4L;
        int wrongData = (int) lng + 2; // converting lng to int will result in data loss
        System.out.println(wrongData);

        // to convert string to a numeric type use the following
        var myString = "4";
        // while parsing, i recommend parsing strings to Int, Long or Double
        System.out.printf("int: %d, float: %.2f, double: %.2f%n", Integer.parseInt(myString), Float.parseFloat(myString), Double.parseDouble(myString));

        System.out.println("===== THE MATH CLASS =====");
        /*
         * The Math class
         * package Java.lang
         * for performing mathematical operations on numeric data types
         */
        float x = 1.234F;
        int roundedInt = Math.round(x); //  1
        int floorInt = (int) Math.floor(x); //  1
        int ceilInt = (int) Math.ceil(x); //  2
        int max = Math.max(floorInt, ceilInt); // 2
        int random = (int) (Math.random() * 1000); // generates a random number between 1 and 1000

        System.out.println("===== FORMATTING NUMBERS =====");
        /*
         *  Formatting numbers
         * NumberFormat // abstract class
         */
        // the get currency instance is used for working with currencies and money formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance(); // this is an example of a factory method. A static method that kind of returns an instance
        String curr = currency.format(1234568.981);
        String percent = NumberFormat.getPercentInstance().format(0.1); // 10%

        System.out.println("===== I/O BASICS =====");
        /*
         * I/O reading user input using the Scanner class
         * The scanner class basically reads data from an input stream
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your myName? ");
        String yourName = scanner.next(); // returns the entire string before the first space" "
        // to retrieve the entire input,
        String everything = scanner.nextLine();

        System.out.println("===== CONDITIONAL EXPRESSIONS =====");
        /*
         * Conditional operations
         * AND = &&
         * OR = ||
         *
         */
        String myName = "emmanuel";
        System.out.println(myName.equals(yourName)); // a simple boolean expression to compare string

        // if statements
        if (myName.equals(yourName))
            System.out.println("Namesake!");
        else
            System.out.println("Move away!");
        //ternary operators can also be used
        System.out.println(myName.equals(yourName) ? "Namesakes" : "Move away ");

        System.out.println("===== LOOPS =====");
        /*
         * Loops
         * pretty much the same syntax
         * while ,do while and for loops
         */
        String[] names = {"omolefe","emmanuel","chukwurah","ebuehi"};

        // the enhanced for loop
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("===== THE END 🚀 =====");
        // Remaining parts to be covered
        // 1. OOP (interfaces, access modifiers, enums, records)
        // 2. Explaining specific keywords like transient, native ...
        // 3. How JRE/JVM works
    }
}