import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select the operation and enter its number:");
            System.out.println("1.   Add new income");
            System.out.println("2.   Add a new expense");
            System.out.println("3.   Choose a tax system");
            System.out.println("end. Sign Out");

          String numberOfOperation = scanner.nextLine();

            if ("1".equals(numberOfOperation)) {
                Incom.incomeSumming();
                System.out.println(Incom.incomeTotal);
            }
            if ("2".equals(numberOfOperation)) {
                Expenses.expensesSumming();
                System.out.println(Expenses.expensesTotal);
            }
            if ("3".equals(numberOfOperation)) {
                TaxSistemChoose.taxSistem();
            }
            if ("end".equalsIgnoreCase(numberOfOperation)) {
                break;
            }
        }
    }
}