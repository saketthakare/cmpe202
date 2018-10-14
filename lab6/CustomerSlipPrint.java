public class CustomerSlipPrint implements SlipPrintStrategy {

    @Override
    public void printBill(MenuItem root_item) {
        System.out.println("            Five Guys");
        System.out.println("        Burgers and Fries");
        System.out.println("         Store # CA-1294");
        System.out.println("      5353 ALMADEN EXPY N60");
        System.out.println("        San Jose, CA 95118");
        System.out.println("         (P) 408-264-9300");
        System.out.println("\n      12/1/2016 1:46:54 PM");
        System.out.println("\n          FIVE GUYS");
        System.out.println("\nOrder Number : 45");
        for (MenuItem item : root_item.getAllItems()) {
            if (item.type == "BASE_ITEM") {

            } else if (item.type == "MAIN_ITEM") {
                System.out.println("1     " + item.name + "                    " + item.price);
            } else if (item.type == "MEAT") {
                System.out.println("        {{{{ " + item.name + " }}}}");
            } else if (item.type == "TOP_BUN") {
                System.out.println("        " + item.name);
            } else if (item.type == "BOTTOM_BUN") {
                System.out.println("        ->|" + item.name);
            }
        }

//        System.out.println("\n      Total:                       $8.38");

    }
}
