import java.util.Scanner;

public class Expenses {

    static int expensesTotal;

    public static int expensesSumming() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the expense amount");
            int expenses = scanner.nextInt();
            expensesTotal += expenses;
            return expensesTotal;
        }
    }
}
