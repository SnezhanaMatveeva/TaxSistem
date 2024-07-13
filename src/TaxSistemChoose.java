public class TaxSistemChoose {
    static int taxIncome;
    static int taxIncomeMinusExpenses;

    public static int taxSistemIncome() {
        taxIncome = Incom.incomeTotal * 6 / 100;
        return taxIncome;
    }

    public static int taxSistemIncomeMinusExpenses() {
        //taxIncomeMinusExpenses = incomeMinusExpenses * 15 / 100 ;
        taxIncomeMinusExpenses = (Incom.incomeTotal - Expenses.expensesTotal) * 15 / 100;
        return taxIncomeMinusExpenses;
    }

    public static void taxSistem() {
        int tax1 = taxSistemIncome();
        int tax2 = taxSistemIncomeMinusExpenses();
        if (tax1 < tax2) {
            System.out.println("We advise you on the simplified tax system for income");
            System.out.println("Your tax will be: " + taxIncome + "$");
            System.out.println("The tax according to the simplified tax system for income minus expenses will be " + taxIncomeMinusExpenses + "$");
            System.out.println("Saving" + (taxIncomeMinusExpenses - taxIncome) + "$");
        }

        if (tax1 > tax2) {
            System.out.println("We advise you the simplified tax system for income minus expenses");
            System.out.println("Your tax will be:: " + taxIncomeMinusExpenses + "$");
            System.out.println("The income tax according to the simplified tax system will be: " + taxIncome + "$");
            System.out.println("Saving" + (taxIncome - taxIncomeMinusExpenses) + "$");
        }
    }
}
