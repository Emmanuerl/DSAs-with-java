import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        short[] shorts = {2, 3, 4, 5, 6};

        Lens lensOne = new Lens("sony", "85mm",true);
        Lens lensTwo = new Lens("sony", "30mm",true);
        Lens lensThree = new Lens("canon", "24-70mm", false);
        System.out.printf("lens one isPrime = %b\nlens two isPrime = %b\nlens three isPrime = %b", lensOne.isPrime, lensTwo.isPrime, lensThree.isPrime);
    }

    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Date expiryDate;

        Lens(String brand, String focalLength, boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
            this.expiryDate = new Date();
        }
    }
}