public class ContainersForBlocks {


    static int amountOfBricksIkeh = 75;
    static int containerCapacityIkeh = 8;
    static int fullContainersIkeh;
    static int totalContainersIkeh;
    static int remainingBricksIkeh;

    public static void main(String[] args) {


        System.out.println("Number of Lego bricks available: " + amountOfBricksIkeh);
        System.out.println("Container capacity (bricks per container): " + containerCapacityIkeh);


        fullContainersIkeh = amountOfBricksIkeh / containerCapacityIkeh;
        System.out.println("Full containers calculated using division: " + fullContainersIkeh);


        remainingBricksIkeh = amountOfBricksIkeh % containerCapacityIkeh;
        System.out.println("Remaining bricks calculated using modulo: " + remainingBricksIkeh);


        totalContainersIkeh = fullContainersIkeh;
        if (remainingBricksIkeh > 0) {
            totalContainersIkeh = totalContainersIkeh + 1;
        }

        System.out.println("Total containers needed (including the partially filled one): " + totalContainersIkeh);
    }
}