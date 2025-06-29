import java.util.Scanner;
import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberOfdice;
        int total = 0;
        boolean isNegative = true;
        int answer;

        while (isNegative) {
            System.out.print("How many dice do you want to roll:");
            numberOfdice = scanner.nextInt();

            if (numberOfdice > 0) {
                total = 0;
                for (int i = 0; i < numberOfdice; i++) {
                    int roll = random.nextInt(1, 7);
                    rollingDie(roll);
                    System.out.println("You rolled:" + roll);

                    total = total + roll;
                    System.out.println("Total:" + total);

                }
                System.out.print("Do you want to exit(yes=1/no=0):");
                answer = scanner.nextInt();
                if (answer == 1) {
                    System.out.println(" Thank You!");
                    isNegative = false;
                } else {

                    System.out.println();
                }

            } else {
                System.out.println("Number of dice can NOT be zero");
            }
        }

        scanner.close();
    }

    static void rollingDie(int roll) {

        String dice1 = """
                 ------
                |      |
                |  ●   |
                |      |
                ------
                """;
        String dice2 = """
                 ------
                | ●    |
                |      |
                |    ● |
                ------
                """;
        String dice3 = """
                 ------
                | ●    |
                |   ●  |
                |    ● |
                ------
                """;
        String dice4 = """
                 ------
                | ●  ● |
                |      |
                | ●  ● |
                ------
                """;
        String dice5 = """
                 ------
                | ●  ● |
                |  ●   |
                | ●  ● |
                ------
                """;
        String dice6 = """
                 ------
                | ●  ● |
                | ●  ● |
                | ●  ● |
                ------
                """;
        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invaied Roll!");

        }
    }
}
