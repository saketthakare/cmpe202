public class PackingSlipPrint implements SlipPrintStrategy {

    @Override
    public void printBill() {
        System.out.println("            Five Guys");
        System.out.println("        Burgers and Fries");
        System.out.println("         Store # CA-1294");
        System.out.println("      5353 ALMADEN EXPY N60");
        System.out.println("        San Jose, CA 95118");
        System.out.println("         (P) 408-264-9300");
        System.out.println("\n      12/1/2016 1:46:54 PM");
        System.out.println("\n          FIVE GUYS");
        System.out.println("Order Number : 45");
        System.out.println("1     LBB                           5.59");
        System.out.println("        {{{{ BACON }}}}");
        System.out.println("        LETTUCE");
        System.out.println("        TOMATO");
        System.out.println("        ->|G ONION");
        System.out.println("        ->|JALA Grilled");
        System.out.println("1     LTL CAJ                       2.79");
        System.out.println("\n      Total:                       $8.38");
    }
}
