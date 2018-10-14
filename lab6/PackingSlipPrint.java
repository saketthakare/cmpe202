public class PackingSlipPrint implements SlipPrintStrategy {

    @Override
    public void printBill(MenuItem root_item) {
        System.out.println("Patties - 1");
        System.out.println("\nOrder Number : 45");
        System.out.println("      12/1/2016 1:46:54 PM");
        System.out.println("          FIVE GUYS");
        System.out.println("\nSandwich# 1");
        for (MenuItem item : root_item.getAllItems()) {
            if (item.type == "MAIN_ITEM") {
                System.out.println("1     " + item.name);
                for (MenuItem subItem : item.getAllItems()) {
                    if (subItem.type == "TOP_BUN") {
                        System.out.println("        " + subItem.name);
                    }
                }
                for (MenuItem subItem : item.getAllItems()) {
                    if (subItem.type == "BOTTOM_BUN") {
                        System.out.println("        ->|" + subItem.name);
                    }
                }
                for (MenuItem subItem : item.getAllItems()) {
                    if (subItem.type == "MEAT") {
                        System.out.println("        {{{{ " + subItem.name + " }}}}");
                    }
                }
            }
        }
        System.out.println("\nRegister:1      Tran Seq No: 57845");
        System.out.println("Cashier: Sakda* S.");


    }
}
