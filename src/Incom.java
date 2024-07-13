import java.util.Scanner;

public class Incom {
    static int incomeTotal;

    public static int incomeSumming() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the amount of income");
            int income = scanner.nextInt();
            incomeTotal += income;
            return incomeTotal;
        }
    }
}
