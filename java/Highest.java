import java.util.Scanner;

public class Highest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter first student name: ");
        String name1 = input.nextLine();

        System.out.print("Enter first student score: ");
        int score1 = input.nextInt();
        input.nextLine();

        System.out.print("Enter second student name: ");
        String name2 = input.nextLine();

        System.out.print("Enter second student score: ");
        int score2 = input.nextInt();
        input.nextLine();

        System.out.print("Enter third student name: ");
        String name3 = input.nextLine();

        System.out.print("Enter third student score: ");
        int score3 = input.nextInt();
        input.nextLine();

        int highest = score1;
        String highestName = name1;
        if (score2 > highest) {
            highest = score2;
            highestName = name2;
        }
        if (score3 > highest) {
            highest = score3;
            highestName = name3;
        }

        int lowest = score1;
        String lowestName = name1;
        if (score2 < lowest) {
            lowest = score2;
            lowestName = name2;
        }
        if (score3 < lowest) {
            lowest = score3;
            lowestName = name3;
        }

        System.out.println("\nResults:");
        System.out.println(highestName + " has the highest score " + highest);
        System.out.println(lowestName + " has the lowest score  " + lowest);

    }
}