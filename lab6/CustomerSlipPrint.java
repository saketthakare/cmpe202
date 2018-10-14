public class CustomerSlipPrint implements SlipPrintStrategy {

    @Override
    public void printBill() {
        System.out.println("Patties - 1");
        System.out.println("\nOrder Number : 45");
        System.out.println("      12/1/2016 1:46:54 PM");
        System.out.println("          FIVE GUYS");
        System.out.println("Sandwich# 1");
        System.out.println("1     LBB");
        System.out.println("        LETTUCE");
        System.out.println("        TOMATO");
        System.out.println("        ->|G ONION");
        System.out.println("        ->|JALA Grilled");
        System.out.println("        {{{{ BACON }}}}");
        System.out.println("1     LTL CAJ                       2.79");
        System.out.println("Register:1      Tran Seq No: 57845");
        System.out.println("Cashier: Sakda* S.");
    }
}
