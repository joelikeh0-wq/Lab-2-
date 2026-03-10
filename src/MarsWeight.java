public class MarsWeight {



        static float earthWeightIkeh = 70.0f;
        static float marsGravityIkeh = 0.38f;
        static float marsWeightFloatIkeh;

        static double marsWeightDoubleIkeh;
        static int marsWeightIntIkeh;
        static char marsWeightCharIkeh;
        static int resultIntIkeh;

        public static void main(String[] args) {

            // Calculate Mars weight using float
            marsWeightFloatIkeh = earthWeightIkeh * marsGravityIkeh;
            System.out.println("Mars weight calculated using float: " + marsWeightFloatIkeh);

            // Assign result to double
            marsWeightDoubleIkeh = marsWeightFloatIkeh;
            System.out.printf("Mars weight stored as double (4 decimal places): %.4f\n", marsWeightDoubleIkeh);

            // Cast double to int
            marsWeightIntIkeh = (int) marsWeightDoubleIkeh;
            System.out.println("Double cast to int: " + marsWeightIntIkeh);

            // Cast int to char
            marsWeightCharIkeh = (char) marsWeightIntIkeh;
            System.out.println("Int cast to char: " + marsWeightCharIkeh);

            // Math operation on char and assign to int
            resultIntIkeh = marsWeightCharIkeh + 5;
            System.out.println("Result after performing math operation on char (+5): " + resultIntIkeh);
        }
    }

















