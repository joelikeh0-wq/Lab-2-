public class EvenOrNotEven {


    static int randomNumberIkeh;

    public static void main(String[] args) {


        randomNumberIkeh = (int)(Math.random() * 100) + 1;
        System.out.println("A random number between 1 and 100 has been generated: " + randomNumberIkeh);


        if (randomNumberIkeh % 2 == 0) {
            System.out.println("The program checked the number using modulo (%).");
            System.out.println("Result: The number " + randomNumberIkeh + " is EVEN.");
        } else {
            System.out.println("The program checked the number using modulo (%).");
            System.out.println("Result: The number " + randomNumberIkeh + " is ODD.");
        }
    }
}